package com.lavajato.LavaJato_2.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "pagamentos")
public class Pagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double valor;
    private String metodopagamento;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JoinColumn(name = "datapagamento")
    private LocalDateTime datapagamento;

    public Pagamento(Double valor, String metodopagamento, LocalDateTime datapagamento) {
        this.valor = valor != null ? valor : 0.0;
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

    public void setDataPagamento(LocalDateTime data) {
        this.datapagamento = data;
    }

    public LocalDateTime getDataPagamento() {
        return datapagamento;
    }
}