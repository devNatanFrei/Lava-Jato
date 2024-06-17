package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.Pedido;
import com.lavajato.LavaJato_2.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/adicionar")
    public Pedido adicionarPedido(@RequestParam Integer clienteId, @RequestParam Integer tiposServicoId, @RequestParam String metodoPagamento) {
        return pedidoService.adicionarPedido(clienteId, tiposServicoId, metodoPagamento);
    }

    @GetMapping("/buscar/{id}")
    public Pedido buscarPedido(@PathVariable Integer id) {
        return pedidoService.buscarPedido(id);
    }

    @GetMapping("/todos")
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @DeleteMapping("/deletar/{id}")
    public void removerPedido(@PathVariable Integer id) {
        Pedido pedido = pedidoService.buscarPedido(id);
        if (pedido != null) {
            pedidoService.removerPedido(pedido);
        }
    }
}
