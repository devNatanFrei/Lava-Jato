package com.lavajato.LavaJato_2.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "servicoslimpeza")
public class ServicoLimpeza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String datahora;
    private String tiposervico;


    private Cliente cliente;



    private ProdutoLimpeza produtolimpeza;

    public ServicoLimpeza() {
    }

    public ServicoLimpeza(String datahora, String tiposervico, Cliente cliente, ProdutoLimpeza produtolimpeza) {
        this.datahora = datahora;
        this.tiposervico = tiposervico;
        this.cliente = cliente;
        this.produtolimpeza = produtolimpeza;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ProdutoLimpeza getProdutoLimpeza() {
        return produtolimpeza;
    }

    public void setProdutoLimpeza(ProdutoLimpeza produtolimpeza) {
        this.produtolimpeza = produtolimpeza;
    }
}
