package br.com.projAulaSpring.controller;

import br.com.projAulaSpring.constant.Constant;
import br.com.projAulaSpring.model.Cliente;
import br.com.projAulaSpring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(Constant.URL_CLIENT)
    public void insert (@RequestBody Cliente cliente){
        clienteService.save(cliente);
    }

    @GetMapping(Constant.URL_CLIENT)
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
}
