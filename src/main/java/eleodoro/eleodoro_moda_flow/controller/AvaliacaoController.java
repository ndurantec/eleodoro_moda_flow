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

import eleodoro.eleodoro_moda_flow.dto.AvaliacaoDto;
import eleodoro.eleodoro_moda_flow.modelo.Avaliacao;
import eleodoro.eleodoro_moda_flow.repository.AvaliacaoRepository;

@RestController
//@CrossOrigin(origin = "http://127.0.0.1:8080")
@CrossOrigin("*")
@RequestMapping(value = "/avaliacao")
public class AvaliacaoController {
    
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @GetMapping(value = "/imprimir")
    public void imprimir(){
        System.out.println("chegou ate aqui");
    }

    @PostMapping(value = "/insert")
    public ResponseEntity insert(@RequestBody AvaliacaoDto avaliacaoDto) {
        
        Avaliacao novoAvaliacao = avaliacaoDto.novoAvaliacao();

        avaliacaoRepository.save(novoAvaliacao);


        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{/id}")
            .buildAndExpand(novoAvaliacao.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoAvaliacao);

    }


}
