package eleodoro.eleodoro_moda_flow.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("Chegou até aqui");
    }
    

    @PostMapping(value = "/insert")
    public ResponseEntity<Produto> insert(@RequestBody ProdutoDto produtoDto){
        Produto novoProduto = produtoDto.novoProduto();
        produtoRepository.save(novoProduto);

        System.out.println("Chegou no método insert");
        System.out.println(produtoDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path(path:"/{id}")
            .buildAndExpand(novoProduto.getId())
            .toUri();
        return ResponseEntity.created(uri).body(novoProduto);



    
    

    }
 }
