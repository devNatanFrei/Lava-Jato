package com.lavajato.LavaJato_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.repository.ClienteRepository;

public class ClienteService {
    private ClienteRepository clienteRepository;

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


    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

   

}
