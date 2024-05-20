package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ControladorCliente {

   @Autowired
   private  ClienteService clienteService;

    @Autowired
    public ControladorCliente(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/adicionar")
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    @GetMapping("/buscar/{id}")
    public Cliente buscarCliente(@PathVariable Integer id) {
        return clienteService.buscarCliente(id);
    }

    @GetMapping("/listar")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

}