package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "servicos_limpeza")
public class ServicoLimpeza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime datahora;

    private String tiposervico;
   
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
 
    @JoinColumn(name = "id_produtolimpeza")
    private ProdutoLimpeza produtolimpeza;
   
    @JoinColumn(name = "id_pagamento")
    private Pagamento pagamento;

   

    public LocalDateTime getDataHora() {
        return datahora;
    }

    public void adicionarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean verificarDisponibilidade(ProdutoLimpeza produtoLimpeza) {
        int quantidade =  produtoLimpeza.getQuantidadeDisponivel();
        return quantidade > 0;
    }

    public void solicitarAgendamento() {

    }

    public String verificarDisponibilidadeDeAgendamento(LocalDateTime dataHora) {
        return "Disponível"; 
    }
    
}