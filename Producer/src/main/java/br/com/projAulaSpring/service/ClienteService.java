package br.com.projAulaSpring.service;

import br.com.projAulaSpring.model.Cliente;
import br.com.projAulaSpring.rabbit.ClienteProducer;
import br.com.projAulaSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteProducer clienteProducer;

    public void save (Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void saveRabbit (Cliente cliente){
        clienteProducer.send(cliente);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public void sendClienteRabbit(Cliente cliente){
        clienteProducer.send(cliente);
    }

    public void delete(String id){
        clienteRepository.deleteById(id);
    }

    public void deleteAll(){
        clienteRepository.deleteAll();
    }
}
