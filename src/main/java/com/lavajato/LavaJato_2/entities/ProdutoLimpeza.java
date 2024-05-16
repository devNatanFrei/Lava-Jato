package com.lavajato.LavaJato_2.entities;


import java.io.Serializable;

public class ProdutoLimpeza implements Serializable {
    private Integer id;
    private String nome;
    private int quantidadedisponivel;
    private double precoUnitario;

    public int getQuantidadeDisponivel() {
        return quantidadedisponivel;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setQuantidadeDisponivel(int quantidade) {
        this.quantidadedisponivel = quantidade;
    }

    public void setPrecoUnitario(double preco) {
        this.precoUnitario = preco;
    }
}