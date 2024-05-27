package com.lavajato.LavaJato_2.entities;

public class ProdutoLimpeza {

    private String nome;
    private int quantidadeDisponivel;
    private double precoUnitario;

    public ProdutoLimpeza(String nome, int quantidadeDisponivel, double precoUnitario) {
        this.nome = nome;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
