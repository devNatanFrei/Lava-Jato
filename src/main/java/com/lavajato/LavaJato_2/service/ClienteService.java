package com.lavajato.LavaJato_2.service;

import java.util.List;

import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente adicionarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarCliente(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente atualizarCliente(Integer id, Cliente clienteAtualizado){
        Cliente clienteExiste = buscarCliente(id);
        if (clienteExiste != null){
            clienteExiste.setContato(clienteAtualizado.getContato());
            clienteExiste.setPlaca(clienteAtualizado.getPlaca());
            clienteExiste.setTipoveiculo(clienteAtualizado.getTipoveiculo());

            return clienteRepository.save(clienteExiste);
        }
        else return null;
    }
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}
