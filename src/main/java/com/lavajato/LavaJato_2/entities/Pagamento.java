package com.lavajato.LavaJato_2.entities;

import java.util.Date;

public class Pagamento {
    private int id;
    private double valor;
    private String metodoPagamento;
    private Date dataPagamento;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setMetodoPagamento(String metodo) {
        this.metodoPagamento = metodo;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setDataPagamento(Date data) {
        this.dataPagamento = data;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }
}