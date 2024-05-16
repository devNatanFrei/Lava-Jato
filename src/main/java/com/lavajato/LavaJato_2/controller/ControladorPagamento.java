package com.lavajato.LavaJato_2.controller;


import com.lavajato.LavaJato_2.entities.Cliente;
import com.lavajato.LavaJato_2.entities.Pagamento;
import com.lavajato.LavaJato_2.repository.PagamentoRepository;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pagamento")
public class ControladorPagamento {
    private PagamentoRepository pagamentoRepository;
    public void adicionarPagamento(@RequestBody Map<String,String> body) throws ParseException {
        Double valor = Double.valueOf(body.get("valor"));
        String metodopagamento = body.get("metodopagamento ");
        String datapagamentoStr = body.get("datapagamento");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date datapagamento = dateFormat.parse(datapagamentoStr);

        Pagamento pagamento = new Pagamento(valor, metodopagamento, datapagamento);
        pagamentoRepository.save(pagamento);
    }

    @GetMapping("/buscar/{id}")
    public Pagamento buscarCliente(@PathVariable Integer id) {
        return pagamentoRepository.findById(id).orElse(null);
    }

    @GetMapping("/listar")
    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }
}