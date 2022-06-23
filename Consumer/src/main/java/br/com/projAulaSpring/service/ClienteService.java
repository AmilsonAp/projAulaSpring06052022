package br.com.projAulaSpring.service;

import br.com.projAulaSpring.model.Cliente;
import br.com.projAulaSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void save (Cliente client){
        clienteRepository.save(client);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
