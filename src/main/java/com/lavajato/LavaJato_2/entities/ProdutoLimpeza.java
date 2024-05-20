package com.lavajato.LavaJato_2.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "produtos_limpeza")
public class ProdutoLimpeza implements Serializable {
    private Integer id;
    private String nome;
    private int quantidadedisponivel;
    private double precoUnitario;

    public ProdutoLimpeza(String nome, int quantidadedisponivel, double precoUnitario) {
        this.nome = nome;
        this.quantidadedisponivel = quantidadedisponivel;
        this.precoUnitario = precoUnitario;
    }
    
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