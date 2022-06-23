package br.com.projAulaSpring.repository;

import br.com.projAulaSpring.model.Vendedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends MongoRepository<Vendedor, String > {
}
