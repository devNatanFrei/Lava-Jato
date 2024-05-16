package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "pagamentos")
public class Pagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double valor;
    private String metodopagamento;
    private Date datapagamento;

    public Pagamento(double valor, String metodopagamento, Date datapagamento) {
        this.valor = valor;
        this.metodopagamento = metodopagamento;
        this.datapagamento = datapagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setMetodoPagamento(String metodo) {
        this.metodopagamento = metodo;
    }

    public String getMetodoPagamento() {
        return metodopagamento;
    }

    public void setDataPagamento(Date data) {
        this.datapagamento = data;
    }

    public Date getDataPagamento() {
        return datapagamento;
    }
}