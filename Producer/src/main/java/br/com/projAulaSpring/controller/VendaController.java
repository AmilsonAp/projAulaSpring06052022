package br.com.projAulaSpring.controller;

import br.com.projAulaSpring.constant.Constant;
import br.com.projAulaSpring.model.Venda;
import br.com.projAulaSpring.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping(Constant.URL_VENDA)
    public void insert (@RequestBody Venda venda){
        vendaService.saveRabbit(venda);
    }

    @GetMapping(Constant.URL_VENDA)
    public List<Venda> findAll(){
        return vendaService.findAll();
    }
}
