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

import eleodoro.eleodoro_moda_flow.dto.AvaliacaoDto;
import eleodoro.eleodoro_moda_flow.modelo.Avaliacao;
import eleodoro.eleodoro_moda_flow.repository.AvaliacaoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/avaliacao")
public class AvaliacaoController {
    
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    // Método de teste, pode ser removido depois
    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("Chegou até aqui");
    }

    // Método de inserção
    @PostMapping(value = "/insert")
    public ResponseEntity<Avaliacao> insert(@RequestBody AvaliacaoDto avaliacaoDto) {
        Avaliacao novaAvaliacao = avaliacaoDto.novoAvaliacao();

        avaliacaoRepository.save(novaAvaliacao);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(novaAvaliacao.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novaAvaliacao);
    }

    // Método para listar todas as avaliações
    @GetMapping
    public ResponseEntity<List<Avaliacao>> findAll() {
        List<Avaliacao> avaliacoes = avaliacaoRepository.findAll();
        return ResponseEntity.ok(avaliacoes);
    }

    // Método para buscar uma avaliação por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Avaliacao> findById(@PathVariable Long id) {
        Optional<Avaliacao> avaliacao = avaliacaoRepository.findById(id);
        if (avaliacao.isPresent()) {
            return ResponseEntity.ok(avaliacao.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para atualizar uma avaliação
    @PutMapping(value = "/{id}")
    public ResponseEntity<Avaliacao> update(@PathVariable Long id, @RequestBody AvaliacaoDto avaliacaoDto) {
        Optional<Avaliacao> avaliacaoOptional = avaliacaoRepository.findById(id);
        if (avaliacaoOptional.isPresent()) {
            Avaliacao avaliacaoExistente = avaliacaoOptional.get();
            Avaliacao avaliacaoAtualizada = avaliacaoDto.atualizarAvaliacao(avaliacaoExistente);
            avaliacaoRepository.save(avaliacaoAtualizada);
            return ResponseEntity.ok(avaliacaoAtualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para excluir uma avaliação
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Avaliacao> avaliacao = avaliacaoRepository.findById(id);
        if (avaliacao.isPresent()) {
            avaliacaoRepository.delete(avaliacao.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
