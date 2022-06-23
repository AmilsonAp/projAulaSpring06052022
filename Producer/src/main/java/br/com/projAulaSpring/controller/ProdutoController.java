package br.com.projAulaSpring.controller;

import br.com.projAulaSpring.constant.Constant;
import br.com.projAulaSpring.model.Produto;
import br.com.projAulaSpring.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(Constant.URL_PRODUTO)
    public void insert (@RequestBody Produto produto){
        produtoService.saveRabbit(produto);
    }

    @GetMapping(Constant.URL_PRODUTO)
    public List<Produto> findAll(){
        return produtoService.findAll();
    }
}
