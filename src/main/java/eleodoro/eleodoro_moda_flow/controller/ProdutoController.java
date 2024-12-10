package eleodoro.eleodoro_moda_flow.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import eleodoro.eleodoro_moda_flow.dto.ProdutoDto;
import eleodoro.eleodoro_moda_flow.modelo.Produto;
import eleodoro.eleodoro_moda_flow.repository.ProdutoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Método para teste, pode ser removido depois
    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("Chegou até aqui");
    }
    
    // Método de inserção
    @PostMapping(value = "/insert")
    public ResponseEntity<Produto> insert(@RequestBody ProdutoDto produtoDto) {
        Produto novoProduto = produtoDto.novoProduto();
        produtoRepository.save(novoProduto);

        System.out.println("Chegou no método insert");
        System.out.println(produtoDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(novoProduto.getId())
            .toUri();
        return ResponseEntity.created(uri).body(novoProduto);
    }

    // Método para listar todos os produtos
    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> produtos = produtoRepository.findAll();
        return ResponseEntity.ok(produtos);
    }

    // Método para buscar um produto por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (produto.isPresent()) {
            return ResponseEntity.ok(produto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para atualizar um produto
    @PutMapping(value = "/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody ProdutoDto produtoDto) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isPresent()) {
            Produto produtoExistente = produtoOptional.get();
            Produto produtoAtualizado = produtoDto.atualizarProduto(produtoExistente);
            produtoRepository.save(produtoAtualizado);
            return ResponseEntity.ok(produtoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para excluir um produto
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (produto.isPresent()) {
            produtoRepository.delete(produto.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
