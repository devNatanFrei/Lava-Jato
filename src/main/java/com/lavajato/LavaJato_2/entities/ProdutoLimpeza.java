package com.lavajato.LavaJato_2.entities;


import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "produtos_limpeza")
public class ProdutoLimpeza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(name = "quantidadedisponivel")
    private Integer quantidadedisponivel;

    @Column(name = "precounitario")
    private Double precounitario;

    public ProdutoLimpeza(String nome, Integer quantidadedisponivel, Double precounitario) {
        this.nome = nome;
        this.quantidadedisponivel = quantidadedisponivel;
        if (precounitario == null){
            this.precounitario = 0.0;
        }
        this.precounitario = precounitario;
    }

    public int getQuantidadeDisponivel() {
        return quantidadedisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadedisponivel = quantidadeDisponivel;
    }

    public double getPrecoUnitario() {
        return precounitario;
    }

    public void setPrecoUnitario(Double preco) {
        this.precounitario = preco;
    }


}