package eleodoro.eleodoro_moda_flow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin("*")
@RequestMapping(value = "*/estampa")
public class EstampaController {
    

    @Autowired
    private EstampaController EstampaController;

    @GetMapping(value = "/imprimir")
    public void imprimir(){
        System.out.println("chegou ate aqui");
    }
}
