package com.lavajato.LavaJato_2.service;

import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import com.lavajato.LavaJato_2.repository.ServicoLimpezaRepository;
import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import com.lavajato.LavaJato_2.repository.ClienteRepository;
import com.lavajato.LavaJato_2.repository.ProdutoLimpezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoLimpezaService {

    private final ServicoLimpezaRepository servicoLimpezaRepository;
    private final ClienteRepository clienteRepository;
    private final ProdutoLimpezaRepository produtoLimpezaRepository;

    @Autowired
    public ServicoLimpezaService(ServicoLimpezaRepository servicoLimpezaRepository, ClienteRepository clienteRepository, ProdutoLimpezaRepository produtoLimpezaRepository) {
        this.servicoLimpezaRepository = servicoLimpezaRepository;
        this.clienteRepository = clienteRepository;
        this.produtoLimpezaRepository = produtoLimpezaRepository;
    }

    public ServicoLimpeza criarServicoLimpeza(ServicoLimpeza servicoLimpeza) {
        return servicoLimpezaRepository.save(servicoLimpeza);
    }

    public ServicoLimpeza atualizarServicoLimpeza(Integer id, ServicoLimpeza servicoLimpeza) {
        Optional<ServicoLimpeza> existingServico = servicoLimpezaRepository.findById(id);
        if (existingServico.isPresent()) {
            ServicoLimpeza updatedServico = existingServico.get();
            updatedServico.setDataHora(servicoLimpeza.getDataHora());
            updatedServico.setTipoServico(servicoLimpeza.getTipoServico());

            updatedServico.setClienteId(servicoLimpeza.getClienteId());
            updatedServico.setProdutoLimpezaId(servicoLimpeza.getProdutoLimpezaId());

            return servicoLimpezaRepository.save(updatedServico);
        } else {
            throw new RuntimeException("Serviço de limpeza não encontrado.");
        }
    }

    public void deletarServicoLimpeza(Integer id) {
        servicoLimpezaRepository.deleteById(id);
    }

    public List<ServicoLimpeza> listarTodosServicosLimpeza() {
        return servicoLimpezaRepository.findAll();
    }

    public Optional<ServicoLimpeza> obterServicoLimpezaPorId(Integer id) {
        return servicoLimpezaRepository.findById(id);
    }

    public Cliente obterClientePorId(Integer clienteId) {
        return clienteRepository.findById(clienteId).orElse(null);
    }

    public ProdutoLimpeza obterProdutoLimpezaPorId(Integer produtolimpezaId) {
        return produtoLimpezaRepository.findById(produtolimpezaId).orElse(null);
    }
}
