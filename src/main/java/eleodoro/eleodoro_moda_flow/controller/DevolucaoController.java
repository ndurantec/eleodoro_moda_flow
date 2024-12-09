package eleodoro.eleodoro_moda_flow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eleodoro.eleodoro_moda_flow.repository.DevolucaoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/devolucao")
public class DevolucaoController {

    @Autowired
    private DevolucaoRepository devolucaoRepository;
    
    @GetMapping(value = "/imprimir")
    public void imprimir(){
    
    }
}
