package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.TiposServico;
import com.lavajato.LavaJato_2.service.TiposServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiposservico")
public class TiposServicoController {

    private final TiposServicoService tiposServicoService;

    @Autowired
    public TiposServicoController(TiposServicoService tiposServicoService) {
        this.tiposServicoService = tiposServicoService;
    }

    @PostMapping("/adicionar")
    public TiposServico adicionarTiposServico(@RequestBody TiposServico tiposServico) {
        return tiposServicoService.adicionarTiposServico(tiposServico);
    }

    @GetMapping("/buscar/{id}")
    public TiposServico buscarTiposServico(@PathVariable Integer id) {
        return tiposServicoService.buscarTiposServico(id);
    }

    @PutMapping("/atualizar/{id}")
    public TiposServico atualizarTiposServico(@PathVariable Integer id, @RequestBody TiposServico tiposServico) {
        return tiposServicoService.atualizarTiposServico(id, tiposServico);
    }

    @GetMapping("/todos")
    public List<TiposServico> listarTiposServico() {
        return tiposServicoService.listarTiposServico();
    }

    @DeleteMapping("/deletar/{id}")
    public void removerTiposServico(@PathVariable Integer id) {
        TiposServico tiposServico = tiposServicoService.buscarTiposServico(id);
        if (tiposServico != null) {
            tiposServicoService.removerTiposServico(tiposServico);
        }
    }
}
