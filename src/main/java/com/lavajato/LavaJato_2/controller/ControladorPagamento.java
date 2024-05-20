package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.Pagamento;
import com.lavajato.LavaJato_2.service.PagamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class ControladorPagamento {
    
    @Autowired
    private PagamentoService pagamentoService;

    public ControladorPagamento(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @GetMapping("/listar")
    public List<Pagamento> listarPagamentos() {
        return pagamentoService.listarPagamentos();
    }

    @GetMapping("/buscar/{id}")
    public Pagamento buscarPagamento(@PathVariable Integer id) {
        return pagamentoService.buscarPagamento(id);
    }

    @PostMapping("/adicionar")
    public Pagamento adicionarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.adicionarPagamento(pagamento);
    }

}
