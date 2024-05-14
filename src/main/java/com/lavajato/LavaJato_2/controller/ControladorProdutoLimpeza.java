package com.lavajato.LavaJato_2.controller;



import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;

import java.util.ArrayList;
import java.util.List;

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
