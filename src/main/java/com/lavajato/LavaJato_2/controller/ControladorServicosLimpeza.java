package com.lavajato.LavaJato_2.controller;



import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import com.lavajato.LavaJato_2.repository.ServicoLimpezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos-limpeza")
public class ControladorServicosLimpeza {
    @Autowired
    private ServicoLimpezaRepository servicoLimpezaRepository;

    @PostMapping("/cadastrar")
    public void adicionarServico(@RequestBody ServicoLimpeza servico) {
        servicoLimpezaRepository.save(servico);
    }
    @GetMapping("/buscar/{id}")
    public ServicoLimpeza buscarServico(@PathVariable Integer id) {
        return servicoLimpezaRepository.findById(id).orElse(null);
    }

    @GetMapping("/listar")
    public List<ServicoLimpeza> listarServicos() {
        return servicoLimpezaRepository.findAll();
    }
}