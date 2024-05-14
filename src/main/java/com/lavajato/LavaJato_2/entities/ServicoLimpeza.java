package com.lavajato.LavaJato_2.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "servicos_limpeza")
public class ServicoLimpeza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dataHora;
    private String tipoServico;
    private Cliente cliente;
    private ProdutoLimpeza produtoLimpeza;
    private Pagamento pagamento;
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void adicionarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean verificarDisponibilidade(ProdutoLimpeza produtoLimpeza) {

        return true;
    }

    public void solicitarAgendamento() {

    }

    public String verificarDisponibilidadeDeAgendamento(LocalDateTime dataHora) {
        return "Disponível";
    }
}