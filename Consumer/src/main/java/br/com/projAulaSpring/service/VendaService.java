package br.com.projAulaSpring.service;

import br.com.projAulaSpring.model.Venda;
import br.com.projAulaSpring.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public void save (Venda venda){
        vendaRepository.save(venda);
    }

    public void saveRabbit (Venda venda){
        vendaRepository.save(venda);
    }

    public List<Venda> findAll(){
        return vendaRepository.findAll();
    }

    public void delete(String id){
        vendaRepository.deleteById(id);
    }

    public void deleteAll(){
        vendaRepository.deleteAll();
    }
}
