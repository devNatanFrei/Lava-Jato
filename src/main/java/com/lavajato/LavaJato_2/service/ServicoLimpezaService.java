package com.lavajato.LavaJato_2.service;

import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import com.lavajato.LavaJato_2.repository.ServicoLimpezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ServicoLimpezaService {

    private final ServicoLimpezaRepository servicoLimpezaRepository;

    @Autowired
    public ServicoLimpezaService(ServicoLimpezaRepository servicoLimpezaRepository) {
        this.servicoLimpezaRepository = servicoLimpezaRepository;
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
            updatedServico.setCliente(servicoLimpeza.getCliente());
            updatedServico.setProdutoLimpeza(servicoLimpeza.getProdutoLimpeza());
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

    public String verificarDisponibilidadeDeAgendamento(LocalDateTime dataHora) {
        List<ServicoLimpeza> servicos = servicoLimpezaRepository.findAll();
        for (ServicoLimpeza servico : servicos) {
            if (servico.getDataHora().isEqual(dataHora)) {
                return "Data e hora indisponíveis";
            }
        }
        return "Data e hora disponíveis";
    }

    public void solicitarAgendamento(ServicoLimpeza servicoLimpeza) {
        if (verificarDisponibilidadeDeAgendamento(servicoLimpeza.getDataHora()).equals("Data e hora disponíveis")) {
            servicoLimpezaRepository.save(servicoLimpeza);
            System.out.println("Agendamento solicitado para: " + servicoLimpeza.getDataHora());
        } else {
            throw new RuntimeException("Data e hora indisponíveis para agendamento.");
        }
    }
}
