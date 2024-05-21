package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import com.lavajato.LavaJato_2.service.ProdutoLimpezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ProdutoLimpeza adicionarProdutoLimpeza(@RequestBody ProdutoLimpeza produto) {
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
