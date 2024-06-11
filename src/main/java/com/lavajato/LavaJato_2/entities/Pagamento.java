package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pagamentos")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valor;
    private String metodopagamento;
    private Date datapagamento;

    public Pagamento() {
    }

    public Pagamento(Double valor, String metodoPagamento, Date datapagamento) {
        this.valor = valor;
        this.metodopagamento = metodoPagamento;
        this.datapagamento = datapagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodopagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodopagamento = metodoPagamento;
    }

    public Date getDataPagamento() {
        return datapagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.datapagamento = dataPagamento;
    }

}
