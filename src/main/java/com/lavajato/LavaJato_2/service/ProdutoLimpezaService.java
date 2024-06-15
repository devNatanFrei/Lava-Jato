package com.lavajato.LavaJato_2.service;

import java.util.List;

import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import com.lavajato.LavaJato_2.repository.ProdutoLimpezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoLimpezaService {
    private final ProdutoLimpezaRepository produtoLimpezaRepository;

    @Autowired
    public ProdutoLimpezaService(ProdutoLimpezaRepository produtoLimpezaRepository) {
        this.produtoLimpezaRepository = produtoLimpezaRepository;
    }

    public ProdutoLimpeza adicionarProdutoLimpeza(ProdutoLimpeza produto) {
        return produtoLimpezaRepository.save(produto);
    }

    public ProdutoLimpeza buscarProdutoLimpeza(Integer id) {
        return produtoLimpezaRepository.findById(id).orElse(null);
    }

    public ProdutoLimpeza atualizarProdutoLimpeza(Integer id, ProdutoLimpeza produtoAtualizado) {
        ProdutoLimpeza produtoExiste = buscarProdutoLimpeza(id);
        if (produtoExiste != null) {
            produtoExiste.setNome(produtoAtualizado.getNome());
            produtoExiste.setQuantidadeDisponivel(produtoAtualizado.getQuantidadeDisponivel());
            produtoExiste.setPrecoUnitario((int) produtoAtualizado.getPrecoUnitario());

            return produtoLimpezaRepository.save(produtoExiste);
        } else {
            return null;
        }
    }

    public List<ProdutoLimpeza> listarProdutosLimpeza() {
        return produtoLimpezaRepository.findAll();
    }

    public void removerProdutoLimpeza(ProdutoLimpeza produto) {
    }
}
