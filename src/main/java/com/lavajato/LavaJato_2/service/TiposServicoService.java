package com.lavajato.LavaJato_2.service;

import java.util.List;
import com.lavajato.LavaJato_2.entities.TiposServico;
import com.lavajato.LavaJato_2.repository.TiposServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiposServicoService {
    private final TiposServicoRepository tiposServicoRepository;

    @Autowired
    public TiposServicoService(TiposServicoRepository tiposServicoRepository) {
        this.tiposServicoRepository = tiposServicoRepository;
    }

    public TiposServico adicionarTiposServico(TiposServico tiposServico) {
        return tiposServicoRepository.save(tiposServico);
    }

    public TiposServico buscarTiposServico(Integer id) {
        return tiposServicoRepository.findById(id).orElse(null);
    }

    public TiposServico atualizarTiposServico(Integer id, TiposServico tiposServicoAtualizado) {
        TiposServico tiposServicoExiste = buscarTiposServico(id);
        if (tiposServicoExiste != null) {
            tiposServicoExiste.setNome(tiposServicoAtualizado.getNome());
            tiposServicoExiste.setPrecoUnitario(tiposServicoAtualizado.getPrecoUnitario());
            return tiposServicoRepository.save(tiposServicoExiste);
        } else {
            return null;
        }
    }

    public List<TiposServico> listarTiposServico() {
        return tiposServicoRepository.findAll();
    }

    public void removerTiposServico(TiposServico tiposServico) {
        tiposServicoRepository.delete(tiposServico);
    }
}
