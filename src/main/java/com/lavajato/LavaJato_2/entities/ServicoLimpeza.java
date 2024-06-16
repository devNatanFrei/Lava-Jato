package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "servicoslimpeza")
public class ServicoLimpeza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String datahora;
    private String tiposervico;
    private Integer cliente_id;
    private Integer produtolimpeza_id;

    public ServicoLimpeza() {
    }

    public ServicoLimpeza(String datahora, String tiposervico, Integer cliente_id, Integer produtolimpeza_id) {
        this.datahora = datahora;
        this.tiposervico = tiposervico;
        this.cliente_id = cliente_id;
        this.produtolimpeza_id = produtolimpeza_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataHora() {
        return datahora;
    }

    public void setDataHora(String datahora) {
        this.datahora = datahora;
    }

    public String getTipoServico() {
        return tiposervico;
    }

    public void setTipoServico(String tiposervico) {
        this.tiposervico = tiposervico;
    }

    public Integer getClienteId() {
        return cliente_id;
    }

    public void setClienteId(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getProdutoLimpezaId() {
        return produtolimpeza_id;
    }

    public void setProdutoLimpezaId(Integer produtolimpeza_id) {
        this.produtolimpeza_id = produtolimpeza_id;
    }
}
