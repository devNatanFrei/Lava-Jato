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
    private Integer quantidadedisponivel;
    private Integer precounitario;

    public ProdutoLimpeza() {
    }

    public ProdutoLimpeza(String nome, Integer quantidadedisponivel, Integer precounitario) {
        this.nome = nome;
        this.quantidadedisponivel = quantidadedisponivel;
        this.precounitario = precounitario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadedisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadedisponivel) {
        this.quantidadedisponivel = quantidadedisponivel;
    }

    public Integer getPrecoUnitario() {
        return precounitario;
    }

    public void setPrecoUnitario(Integer precounitario) {
        this.precounitario = precounitario;
    }
}
