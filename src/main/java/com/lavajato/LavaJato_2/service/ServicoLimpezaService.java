package com.lavajato.LavaJato_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import com.lavajato.LavaJato_2.repository.ServicoLimpezaRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicoLimpezaService {
    private final ServicoLimpezaRepository servicoLimpezaRepository;

    @Autowired
    public ServicoLimpezaService(ServicoLimpezaRepository servicoLimpezaRepository) {
        this.servicoLimpezaRepository = servicoLimpezaRepository;
    }

    public ServicoLimpeza adicionarServico(ServicoLimpeza servicoLimpeza) {
        return servicoLimpezaRepository.save(servicoLimpeza);
    }

    public ServicoLimpeza buscarServico(Integer id) {
        return servicoLimpezaRepository.findById(id).orElse(null);
    }


    public List<ServicoLimpeza> listarServicos() {
        return servicoLimpezaRepository.findAll();
    }

}
