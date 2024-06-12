package com.lavajato.LavaJato_2.controller;

import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import com.lavajato.LavaJato_2.service.ServicoLimpezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicoLimpeza")
public class ServicoLimpezaController {

    private final ServicoLimpezaService servicoLimpezaService;

    @Autowired
    public ServicoLimpezaController(ServicoLimpezaService servicoLimpezaService) {
        this.servicoLimpezaService = servicoLimpezaService;
    }

    @PostMapping("/adicionar")
    public ServicoLimpeza adicionarServicoLimpeza(@RequestBody ServicoLimpeza servicoLimpeza) {
        return servicoLimpezaService.criarServicoLimpeza(servicoLimpeza);
    }

    @PutMapping("/atualizar/{id}")
    public ServicoLimpeza atualizarServicoLimpeza(@PathVariable Integer id, @RequestBody ServicoLimpeza servicoLimpeza) {
        return servicoLimpezaService.atualizarServicoLimpeza(id, servicoLimpeza);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarServicoLimpeza(@PathVariable Integer id) {
        servicoLimpezaService.deletarServicoLimpeza(id);
    }

    @GetMapping("/todos")
    public List<ServicoLimpeza> obterTodosServicosLimpeza() {
        return servicoLimpezaService.listarTodosServicosLimpeza();
    }

    @GetMapping("/obter/{id}")
    public Optional<ServicoLimpeza> obterServicoLimpezaPorId(@PathVariable Integer id) {
        return servicoLimpezaService.obterServicoLimpezaPorId(id);
    }

    @PostMapping("/solicitaragendamento")
    public String solicitarAgendamento(@RequestBody ServicoLimpeza servicoLimpeza) {
        try {
            servicoLimpezaService.solicitarAgendamento(servicoLimpeza);
            return "Agendamento solicitado com sucesso!";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    @GetMapping("/verificardisponibilidadedeagendamento/{dataHora}")
    public String verificarDisponibilidadeDeAgendamento(@PathVariable String dataHora) {
        LocalDateTime dateTime = LocalDateTime.parse(dataHora);
        return servicoLimpezaService.verificarDisponibilidadeDeAgendamento(dateTime);
    }
}
