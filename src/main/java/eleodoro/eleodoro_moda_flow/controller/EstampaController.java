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

import eleodoro.eleodoro_moda_flow.dto.EstampaDto;
import eleodoro.eleodoro_moda_flow.dto.ProdutoDto;
import eleodoro.eleodoro_moda_flow.modelo.Estampa;
import eleodoro.eleodoro_moda_flow.repository.EstampaRepository;




// @RestController
// @CrossOrigin("*")
// @RequestMapping(value = "*/estampa")
// public class EstampaController {
    

//     @Autowired
//     private EstampaRepository estampaRepository;

//     @GetMapping(value = "/imprimir")
//     public void imprimir(){
//         System.out.println("chegou ate aqui");
//     }


//     @PostMapping(value = "/insert")
//     public ResponseEntity<Estampa> insert(@RequestBody EstampaDto estampaDto){
//         Estampa novoEstampa = estampaDto.novoEstampa();
//         // estampaRepository.save(novoEstampa);

//         System.out.println("chegou no metodo insert");
//         System.out.println(estampaDto.toString());
        
//     //    URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//             // .path("{/id}")
//             // .buildAndExpand(novoEstampa.getId())
//             // .toUri();

//         return ResponseEntity.created(Uri).body(novoEstampa);
//     }
// }