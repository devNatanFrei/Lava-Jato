package com.lavajato.LavaJato_2.controller;



import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import com.lavajato.LavaJato_2.repository.ServicoLimpezaRepository;
import com.lavajato.LavaJato_2.service.ServicoLimpezaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos-limpeza")
public class ControladorServicosLimpeza {
    @Autowired
    private ServicoLimpezaService servicoLimpeza;

    @PostMapping("/adicionar")
    public void adicionarServico(@RequestBody ServicoLimpeza servico) {
        servicoLimpeza.adicionarServico(servico);
    }

    @GetMapping("/buscar/{id}")
    public ServicoLimpeza buscarServico(@PathVariable Integer id) {
        return servicoLimpeza.buscarServico(id);
    }

    @GetMapping("/listar")
    public List<ServicoLimpeza> listarServicos() {
        return servicoLimpeza.listarServicos();
    }

   
}