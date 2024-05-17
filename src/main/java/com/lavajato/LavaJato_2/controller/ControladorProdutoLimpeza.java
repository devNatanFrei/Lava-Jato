package com.lavajato.LavaJato_2.controller;



import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos_limpeza")
public class ControladorProdutoLimpeza {
    private List<ProdutoLimpeza> produtos;

    public ControladorProdutoLimpeza() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProdutoLimpeza(ProdutoLimpeza produto) {
        produtos.add(produto);
    }

    public void removerProdutoLimpeza(ProdutoLimpeza produto) {
        produtos.remove(produto);
    }

    public List<ProdutoLimpeza> listarProdutoLimpeza() {
        return produtos;
    }
}
