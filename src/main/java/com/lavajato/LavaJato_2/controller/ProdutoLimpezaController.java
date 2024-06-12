package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import com.lavajato.LavaJato_2.service.ProdutoLimpezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoLimpezaController {

    private final ProdutoLimpezaService produtoLimpezaService;

    @Autowired
    public ProdutoLimpezaController(ProdutoLimpezaService produtoLimpezaService) {
        this.produtoLimpezaService = produtoLimpezaService;
    }

    @PostMapping("/adicionar")
    public ProdutoLimpeza adicionarProduto(@RequestBody ProdutoLimpeza produto) {
        return produtoLimpezaService.adicionarProdutoLimpeza(produto);
    }

    @GetMapping("/buscar/{id}")
    public ProdutoLimpeza buscarProduto(@PathVariable Integer id) {
        return produtoLimpezaService.buscarProdutoLimpeza(id);
    }

    @PutMapping("/atualizar/{id}")
    public ProdutoLimpeza atualizarProduto(@PathVariable Integer id, @RequestBody ProdutoLimpeza produto) {
        return produtoLimpezaService.atualizarProdutoLimpeza(id, produto);
    }

    @GetMapping
    public List<ProdutoLimpeza> listarProdutos() {
        return produtoLimpezaService.listarProdutosLimpeza();
    }

    @DeleteMapping("/deletar/{id}")
    public void removerProduto(@PathVariable Integer id) {
        ProdutoLimpeza produto = produtoLimpezaService.buscarProdutoLimpeza(id);
        if (produto != null) {
            produtoLimpezaService.removerProdutoLimpeza(produto);
        }
    }
}
