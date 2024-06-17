package com.lavajato.LavaJato_2.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tiposservico_id")
    private TiposServico tiposServico;

    @ManyToOne
    @JoinColumn(name = "pagamento_id")
    private Pagamento pagamento;

    public Pedido() {}

    public Pedido(Cliente cliente, TiposServico tiposServico, Pagamento pagamento) {
        this.cliente = cliente;
        this.tiposServico = tiposServico;
        this.pagamento = pagamento;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TiposServico getTiposServico() {
        return tiposServico;
    }

    public void setTiposServico(TiposServico tiposServico) {
        this.tiposServico = tiposServico;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
