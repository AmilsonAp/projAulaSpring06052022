package Controller;

import br.com.projAulaSpring.App;
import br.com.projAulaSpring.model.Client;
import br.com.projAulaSpring.service.ClientService;
import org.junit.Assert;
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
public class ClientControllerTeste {

    @Autowired
    private ClientService clientService;

    @Test
    public void save() throws Exception {

        long qtd = 200;

        clientService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            clientService.sendClientRabbit(new Client(String.valueOf(i),  "teste"+i, dtf.format(now),1+i));
        }

        Thread.sleep(5000);
        List<Client> lst = clientService.findAll();

        System.out.println("Qtd:" + lst.size());
        //Assert.assertEquals(lst.size(), qtd);
    }

}