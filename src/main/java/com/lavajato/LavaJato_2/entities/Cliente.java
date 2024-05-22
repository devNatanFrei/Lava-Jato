package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String contato;
    private String tipoveiculo;
    private String placa;

    public Cliente(String contato, String tipoVeiculo, String placa) {
        this.contato = contato;
        this.tipoveiculo = tipoVeiculo;
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

    public String getTipoVeiculo() {
        return tipoveiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoveiculo = tipoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
