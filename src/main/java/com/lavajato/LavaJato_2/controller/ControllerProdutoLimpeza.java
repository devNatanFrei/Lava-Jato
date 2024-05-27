package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import java.util.ArrayList;
import java.util.List;

public class ControllerProdutoLimpeza {

    private List<ProdutoLimpeza> produtos;

    public ControllerProdutoLimpeza() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProdutoLimpeza(ProdutoLimpeza produto) {
        produtos.add(produto);
    }

    public void removerProdutoLimpeza(ProdutoLimpeza produto) {
        produtos.remove(produto);
    }

    public List<ProdutoLimpeza> listarProdutosLimpeza() {
        return new ArrayList<>(produtos);
    }
}


