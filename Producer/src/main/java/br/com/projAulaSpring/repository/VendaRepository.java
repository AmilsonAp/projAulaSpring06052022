package br.com.projAulaSpring.repository;

import br.com.projAulaSpring.model.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String > {
}
