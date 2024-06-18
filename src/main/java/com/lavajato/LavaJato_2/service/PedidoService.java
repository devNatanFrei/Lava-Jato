package com.lavajato.LavaJato_2.service;

import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.entities.Pedido;
import com.lavajato.LavaJato_2.entities.Pagamento;
import com.lavajato.LavaJato_2.entities.TiposServico;
import com.lavajato.LavaJato_2.repository.ClienteRepository;
import com.lavajato.LavaJato_2.repository.PedidoRepository;
import com.lavajato.LavaJato_2.repository.TiposServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final TiposServicoRepository tiposServicoRepository;
    private final PagamentoService pagamentoService;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository, TiposServicoRepository tiposServicoRepository, PagamentoService pagamentoService) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
        this.tiposServicoRepository = tiposServicoRepository;
        this.pagamentoService = pagamentoService;
    }

    public Pedido adicionarPedido(Integer clienteId, Integer tiposServicoId, String metodoPagamento) {
        Cliente cliente = clienteRepository.findById(clienteId).orElse(null);
        TiposServico tiposServico = tiposServicoRepository.findById(tiposServicoId).orElse(null);

        if (cliente != null && tiposServico != null) {
            Pagamento pagamento = new Pagamento();
            pagamento.setValor(tiposServico.getPrecoUnitario());
            pagamento.setMetodoPagamento(metodoPagamento);
            pagamento.setDataPagamento(LocalDateTime.now());
            Pagamento pagamentoSalvo = pagamentoService.adicionarPagamento(pagamento);


            Pedido pedido = new Pedido(cliente, tiposServico, pagamentoSalvo);
            return pedidoRepository.save(pedido);
        }
        return null;
    }

    public Pedido buscarPedido(Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public void removerPedido(Pedido pedido) {
        pedidoRepository.delete(pedido);
    }
}
