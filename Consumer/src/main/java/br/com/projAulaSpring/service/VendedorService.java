package br.com.projAulaSpring.service;

import br.com.projAulaSpring.model.Vendedor;
import br.com.projAulaSpring.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public void save (Vendedor vendedor){
        vendedorRepository.save(vendedor);
    }

    public void saveRabbit (Vendedor vendedor){
        vendedorRepository.save(vendedor);
    }

    public List<Vendedor> findAll(){
        return vendedorRepository.findAll();
    }

    public void delete(String id){
        vendedorRepository.deleteById(id);
    }

    public void deleteAll(){
        vendedorRepository.deleteAll();
    }
}
