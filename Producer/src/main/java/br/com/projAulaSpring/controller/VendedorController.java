package br.com.projAulaSpring.controller;

import br.com.projAulaSpring.constant.Constant;
import br.com.projAulaSpring.model.Vendedor;
import br.com.projAulaSpring.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @PostMapping(Constant.URL_VENDEDOR)
    public void insert (@RequestBody Vendedor vendedor){
        vendedorService.saveRabbit(vendedor);
    }

    @GetMapping(Constant.URL_VENDEDOR)
    public List<Vendedor> findAll(){
        return vendedorService.findAll();
    }
}
