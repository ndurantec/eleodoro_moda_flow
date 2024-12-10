package eleodoro.eleodoro_moda_flow.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import eleodoro.eleodoro_moda_flow.dto.PedidoDto;
import eleodoro.eleodoro_moda_flow.modelo.Pedido;
import eleodoro.eleodoro_moda_flow.repository.PedidoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("Chegou até aqui");
    }

    @PostMapping(value = "/inserir")
    public ResponseEntity<Pedido> insert(@RequestBody PedidoDto pedidoDto) {
        Pedido novoPedido = pedidoDto.novoPedido();
        pedidoRepository.save(novoPedido);

        System.out.println("Chegou no método insert");
        System.out.println(pedidoDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(novoPedido.getId())
                .toUri();

        return ResponseEntity.created(uri).body(novoPedido);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Pedido> update(@PathVariable Long id, @RequestBody PedidoDto pedidoDto) {
        Optional<Pedido> pedidoBanco = pedidoRepository.findById(id);

        if (pedidoBanco.isPresent()) {
            Pedido pedidoModificado = pedidoBanco.get();
            pedidoModificado.setQuantidade(pedidoDto.getQuantidade());
            pedidoModificado.setEstampa(pedidoDto.getEstampa());
            pedidoModificado.setValorTotal(pedidoDto.getValorTotal());
            pedidoDto.setData(pedidoDto.getData());

            pedidoRepository.save(pedidoModificado);
            return ResponseEntity.ok(pedidoModificado);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
