package it.silviafabbri.tesi.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.silviafabbri.tesi.Dao.IncassoDao;
import jakarta.jms.JMSException;
import jakarta.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class Receiver {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private IncassoDao Dao;


    @JmsListener(destination = "incassi", containerFactory = "myFactory")
    public void receiveMessage(TextMessage textMessage) throws JsonProcessingException, JMSException {
        //System.err.println(textMessage.getText());
        Incasso incasso = objectMapper.readValue(textMessage.getText(), Incasso.class);
        Dao.createPostgres(incasso);

    }
}
