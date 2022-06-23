package Controller;

import br.com.projAulaSpring.App;
import br.com.projAulaSpring.model.Cliente;
import br.com.projAulaSpring.service.ClienteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class ClienteControllerTeste {

    @Autowired
    private ClienteService clienteService;

    @Test
    public void save() throws Exception {

        long qtd = 200;

        clienteService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            Cliente c = new Cliente();
            c.set_id(String.valueOf(i));
            c.setNome("Teste" + String.valueOf(i));
            c.setTelefone(String.valueOf(i));
            clienteService.sendClienteRabbit(c);
        }

        Thread.sleep(5000);
        List<Cliente> lst = clienteService.findAll();

        System.out.println("Qtd:" + lst.size());
        //Assert.assertEquals(lst.size(), qtd);
    }

}