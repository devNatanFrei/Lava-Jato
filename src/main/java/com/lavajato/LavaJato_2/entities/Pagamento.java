package com.lavajato.LavaJato_2.entities;




import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "pagamento")
public class Pagamento implements Serializable {
    @Id
    private Integer id;
    private Integer valor;

    private String datapagamento;
    private String metodopagamento;


    public Pagamento() {
    }

    public Pagamento(Integer valor, String datapagamento, String metodopagamento) {
        this.valor = valor;
        this.datapagamento = datapagamento;
        this.metodopagamento = metodopagamento;
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
