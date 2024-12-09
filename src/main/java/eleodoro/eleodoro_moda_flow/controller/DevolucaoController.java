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

import eleodoro.eleodoro_moda_flow.dto.DevolucaoDto;
import eleodoro.eleodoro_moda_flow.modelo.Devolucao;
import eleodoro.eleodoro_moda_flow.repository.DevolucaoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/devolucao")
public class DevolucaoController {

    @Autowired
    private DevolucaoRepository devolucaoRepository;

    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("Chegou até o controlador de Devolução");
    }

    @PostMapping(value = "/inserir")
    public ResponseEntity<Devolucao> insert(@RequestBody DevolucaoDto devolucaoDto) {
        Devolucao novaDevolucao = devolucaoDto.novaDevolucao();
        devolucaoRepository.save(novaDevolucao);

        System.out.println("Chegou no método insert de devolução");
        System.out.println(devolucaoDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(novaDevolucao.getId())
                .toUri();

        return ResponseEntity.created(uri).body(novaDevolucao);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Devolucao> buscarPorId(@PathVariable Long id) {
        Optional<Devolucao> devolucao = DevolucaoRepository.findById(id);
        return devolucao.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Devolucao> update(@PathVariable Long id, @RequestBody DevolucaoDto devolucaoDto) {
        Optional<Devolucao> devolucaoBanco = DevolucaoRepository.findById(id);

        if (devolucaoBanco.isPresent()) {
            Devolucao devolucaoModificada = devolucaoBanco.get();
            devolucaoModificada.setMotivo(devolucaoDto.getMotivo());
            devolucaoModificada.setDataDevolucao(devolucaoDto.getDataDevolucao());

            devolucaoRepository.save(devolucaoModificada);
            return ResponseEntity.ok(devolucaoModificada);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (devolucaoRepository.existsById(id)) {
            devolucaoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
