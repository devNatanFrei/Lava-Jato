package com.lavajato.LavaJato_2.entities;




import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "pagamentos")
public class Pagamento implements Serializable {
    @Id
    private Integer id;
    private Integer valor;
    private String datapagamento;
    private String metodopagamento;


    public Pagamento() {
    }

    public Pagamento(Integer valor, String data_pagamento, String metodo_pagamento) {
        this.valor = valor;
        this.datapagamento = data_pagamento;
        this.metodopagamento = metodo_pagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodopagamento;
    }

    public void setMetodoPagamento(String metodopagamento) {
        this.metodopagamento = metodopagamento;
    }

    public String getDataPagamento() {
        return datapagamento;
    }

    public void setDataPagamento(String datapagamento) {
        this.datapagamento = datapagamento;
    }
}
