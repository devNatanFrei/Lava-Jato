package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tiposservico")
public class TiposServico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer precounitario;

    public TiposServico() {}

    public TiposServico(String nome, Integer precounitario) {
        this.nome = nome;
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

    public Integer getPrecoUnitario() {
        return precounitario;
    }

    public void setPrecoUnitario(Integer precounitario) {
        this.precounitario = precounitario;
    }
}
