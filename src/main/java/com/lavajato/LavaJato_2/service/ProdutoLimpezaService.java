package com.lavajato.LavaJato_2.service;

import com.lavajato.LavaJato_2.entities.ProdutoLimpeza;
import com.lavajato.LavaJato_2.repository.ProdutoLimpezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoLimpezaService {
    private ProdutoLimpezaRepository produtoLimpezaRepository;

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

    public List<ProdutoLimpeza> listarProdutosLimpeza() {
        return produtoLimpezaRepository.findAll();
    }

   
}
