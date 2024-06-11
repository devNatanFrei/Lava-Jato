package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.Pagamento;
import com.lavajato.LavaJato_2.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    @Autowired
    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/adicionar")
    public Pagamento adicionarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.adicionarPagamento(pagamento);
    }

    @GetMapping("/buscar/{id}")
    public Pagamento buscarPagamento(@PathVariable Integer id) {
        return pagamentoService.buscarPagamento(id);
    }

    @PutMapping("/atualizar/{id}")
    public Pagamento atualizarPagamento(@PathVariable Integer id, @RequestBody Pagamento pagamento) {
        return pagamentoService.atualizarPagamento(id, pagamento);
    }

    @GetMapping("/listar")
    public List<Pagamento> listarPagamentos() {
        return pagamentoService.listarPagamentos();
    }

    @DeleteMapping("/deletar/{id}")
    public void removerPagamento(@PathVariable Integer id) {
        pagamentoService.removerPagamento(id);
    }
}
