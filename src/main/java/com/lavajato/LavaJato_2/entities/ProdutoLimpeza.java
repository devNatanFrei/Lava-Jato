package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "produtoslimpeza")
public class ProdutoLimpeza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private int quantidadedisponivel;
    private double precounitario;

    public ProdutoLimpeza(String nome, int quantidadeDisponivel, double precoUnitario) {
        this.nome = nome;
        this.quantidadedisponivel = quantidadeDisponivel;
        this.precounitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDisponivel() {
        return quantidadedisponivel;
    }

    public double getPrecoUnitario() {
        return precounitario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadedisponivel = quantidadeDisponivel;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precounitario = precoUnitario;
    }


}