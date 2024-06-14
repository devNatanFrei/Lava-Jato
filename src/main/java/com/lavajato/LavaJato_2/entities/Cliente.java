package com.lavajato.LavaJato_2.entities;




import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "clientes")

public class Cliente implements Serializable {
    @Id
    private Integer id;
    private String contato;
    private String tipoveiculo;
    private String placa;

    public Cliente(String contato, String tipoveiculo, String placa) {
        this.contato = contato;
        this.tipoveiculo = tipoveiculo;
        this.placa = placa;
    }

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipoveiculo() {
        return tipoveiculo;
    }

    public void setTipoveiculo(String tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
