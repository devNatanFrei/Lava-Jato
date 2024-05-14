package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.mysql.MySQLConnector;
import com.lavajato.LavaJato_2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ControladorCliente {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/cadastrar")
    public void adicionarCliente(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @GetMapping("/buscar/{id}")
    public Cliente buscarCliente(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @GetMapping("/listar")
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}