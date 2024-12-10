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

import eleodoro.eleodoro_moda_flow.dto.VendaDto;
import eleodoro.eleodoro_moda_flow.modelo.Venda;
import eleodoro.eleodoro_moda_flow.repository.VendaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/venda")
public class VendaController {

    @Autowired
    private VendaRepository vendaRepository;

    // Método de teste, pode ser removido depois
    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("Chegou até aqui");
    }

    // Método de inserção
    @PostMapping(value = "/insert")
    public ResponseEntity<Venda> insert(@RequestBody VendaDto vendaDto) {
        Venda novaVenda = vendaDto.novoVenda();

        vendaRepository.save(novaVenda);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(novaVenda.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novaVenda);
    }

    // Método para listar todas as vendas
    @GetMapping
    public ResponseEntity<List<Venda>> findAll() {
        List<Venda> vendas = vendaRepository.findAll();
        return ResponseEntity.ok(vendas);
    }

    // Método para buscar uma venda por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Venda> findById(@PathVariable Long id) {
        Optional<Venda> venda = vendaRepository.findById(id);
        if (venda.isPresent()) {
            return ResponseEntity.ok(venda.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para atualizar uma venda
    @PutMapping(value = "/{id}")
    public ResponseEntity<Venda> update(@PathVariable Long id, @RequestBody VendaDto vendaDto) {
        Optional<Venda> vendaOptional = vendaRepository.findById(id);
        if (vendaOptional.isPresent()) {
            Venda vendaExistente = vendaOptional.get();
            vendaExistente.setValorTotal(vendaDto.getValorTotal());
            vendaExistente.setDataVenda(vendaDto.getDataVenda());
            vendaExistente.setProduto(vendaDto.getProduto());
            vendaExistente.setCliente(vendaDto.getCliente());

            vendaRepository.save(vendaExistente);
            return ResponseEntity.ok(vendaExistente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para excluir uma venda
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Venda> venda = vendaRepository.findById(id);
        if (venda.isPresent()) {
            vendaRepository.delete(venda.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
