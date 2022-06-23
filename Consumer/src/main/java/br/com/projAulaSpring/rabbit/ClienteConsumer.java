package br.com.projAulaSpring.rabbit;

import br.com.projAulaSpring.model.Cliente;
import br.com.projAulaSpring.service.ClienteService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ClienteConsumer {

    @Autowired
    private ClienteService clienteService;

    @RabbitListener(queues = {"${queue.cliente.name}"})
    public void receive (@Payload Cliente cliente){
        System.out.println("Id: "+ cliente.get_id() + "\nNome: " + cliente.getNome()
                + "\nTelefone: " + cliente.getTelefone());
        //Inserir dado no Mongo
        clienteService.save(cliente);
    }
}