package br.com.projAulaSpring.service;

import br.com.projAulaSpring.model.Client;
import br.com.projAulaSpring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void save (Client client){
        clientRepository.save(client);
    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }
}
