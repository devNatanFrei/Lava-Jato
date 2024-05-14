package com.lavajato.LavaJato_2.entities;


public class ProdutoLimpeza {
    private String nome;
    private int quantidadeDisponivel;
    private double precoUnitario;

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setQuantidadeDisponivel(int quantidade) {
        this.quantidadeDisponivel = quantidade;
    }

    public void setPrecoUnitario(double preco) {
        this.precoUnitario = preco;
    }
}