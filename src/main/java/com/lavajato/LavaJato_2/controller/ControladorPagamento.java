package com.lavajato.LavaJato_2.controller;


import com.lavajato.LavaJato_2.entities.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class ControladorPagamento {
    private List<Pagamento> pagamentos;

    public ControladorPagamento() {
        this.pagamentos = new ArrayList<>();
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void removerPagamento(Pagamento pagamento) {
        pagamentos.remove(pagamento);
    }

    public Pagamento buscarPagamentoPorId(int id) {
        return null;
    }

    public List<Pagamento> listarPagamentos() {
        return pagamentos;
    }
}