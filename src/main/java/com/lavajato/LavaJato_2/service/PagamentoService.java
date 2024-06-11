package com.lavajato.LavaJato_2.service;

import com.lavajato.LavaJato_2.entities.Pagamento;
import com.lavajato.LavaJato_2.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public Pagamento adicionarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public Pagamento buscarPagamento(Integer id) {
        return pagamentoRepository.findById(id).orElse(null);
    }

    public Pagamento atualizarPagamento(Integer id, Pagamento pagamentoAtualizado) {
        Optional<Pagamento> pagamentoExiste = pagamentoRepository.findById(id);
        if (pagamentoExiste.isPresent()) {
            Pagamento pagamento = pagamentoExiste.get();
            pagamento.setValor(pagamentoAtualizado.getValor());
            pagamento.setMetodoPagamento(pagamentoAtualizado.getMetodoPagamento());
            pagamento.setDataPagamento(pagamentoAtualizado.getDataPagamento());
            return pagamentoRepository.save(pagamento);
        } else {
            return null;
        }
    }

    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }

    public void removerPagamento(Integer id) {
        pagamentoRepository.deleteById(id);
    }
}
