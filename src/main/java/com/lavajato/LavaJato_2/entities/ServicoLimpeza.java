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

    @Column(name = "datahora", nullable = false)
    private LocalDateTime datahora;

    @Column(name = "tiposervico", nullable = false)
    private String tiposervico;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "produtolimpeza_id", nullable = false)
    private ProdutoLimpeza produtolimpeza;

    public ServicoLimpeza() {
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return datahora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.datahora = dataHora;
    }

    public String getTipoServico() {
        return tiposervico;
    }

    public void setTipoServico(String tipoServico) {
        this.tiposervico = tipoServico;
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

    public void setProdutoLimpeza(ProdutoLimpeza produtoLimpeza) {
        this.produtolimpeza = produtoLimpeza;
    }

    public void solicitarAgendamento() {
        System.out.println("Agendamento solicitado para: " + this.datahora);
    }

    public String verificarDisponibilidadeDeAgendamento(LocalDateTime dataHora) {
        if (dataHora.isAfter(LocalDateTime.now())) {
            return "Data e hora disponíveis";
        } else {
            return "Data e hora indisponíveis";
        }
    }
}
