package com.lavajato.LavaJato_2.service;

import com.lavajato.LavaJato_2.entities.Pagamento;
import com.lavajato.LavaJato_2.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PagamentoService {
    private PagamentoRepository pagamentoRepository;

    @Autowired
    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public Pagamento adicionarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public Pagamento buscarPagamento(Integer id) {
        return pagamentoRepository.findById(id).orElse(null);
    }

    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }
}
