package com.lavajato.LavaJato_2.repository;

import com.lavajato.LavaJato_2.entities.Pagamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PagamentoRepository extends MongoRepository<Pagamento,Integer> {
}
