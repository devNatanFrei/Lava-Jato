package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ControladorCliente {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/adicionar")
    public Cliente adicionarCliente(@RequestBody Map<String,String> body) {
        String contato = body.get("contato");
        String tipoVeiculo = body.get("tipoveiculo");
        String placa = body.get("placa");
        Cliente newCliente = new Cliente(contato, tipoVeiculo, placa);
        return clienteRepository.save(newCliente);
    }

    @GetMapping("/buscar/{id}")
    public Cliente buscarCliente(@PathVariable Integer id) {

        return clienteRepository.findById(id).orElse(null);
    }

    @GetMapping("/listar")
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}