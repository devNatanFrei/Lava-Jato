package com.lavajato.LavaJato_2.repository;

import com.lavajato.LavaJato_2.entities.ServicoLimpeza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoLimpezaRepository extends MongoRepository<ServicoLimpeza, Integer> {

}
