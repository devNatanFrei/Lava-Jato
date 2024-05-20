package com.lavajato.LavaJato_2.controller;


import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import com.lavajato.LavaJato_2.repository.ProdutoLimpezaRepository;
import com.lavajato.LavaJato_2.repository.ServicoLimpezaRepository;
import com.lavajato.LavaJato_2.service.ClienteService;
import com.lavajato.LavaJato_2.service.ProdutoLimpezaService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos_limpeza")
public class ControladorProdutoLimpeza {
    
    @Autowired
    private ProdutoLimpezaService produtoLimpezaService;

    @Autowired
    public ControladorProdutoLimpeza(ProdutoLimpezaService produtoLimpezaService) {
        this.produtoLimpezaService = produtoLimpezaService;
    }


    @PostMapping("/adicionar")
    public ProdutoLimpeza adicionarProdutoLimpeza(ProdutoLimpeza produto) {
       return produtoLimpezaService.adicionarProdutoLimpeza(produto);
    }

    @GetMapping("/buscar/{id}")
    public ProdutoLimpeza buscarServico(@PathVariable Integer id) {
        return produtoLimpezaService.buscarProdutoLimpeza(id);
    }


    @GetMapping("/listar")
    public List<ProdutoLimpeza> listarProdutoLimpeza() {
        return produtoLimpezaService.listarProdutosLimpeza();
    }
}
