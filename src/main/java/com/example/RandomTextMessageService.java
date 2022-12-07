package com.example;

import com.example.MessageService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("messageService2")
public class RandomTextMessageService implements MessageService {

List<String> message = new ArrayList<String>();
    {
        message.add("Message 1");
        message.add("Message 2");
        message.add("Message 3");
        message.add("Message 4");
        message.add("Message 5");
        message.add("Message 6");
        message.add("Message 7");
        message.add("Message 8");
        message.add("Message 9");
        message.add("Message 10");
    }
    @Override
    public String getMessage() {
        Random rand = new Random();
        int random = rand.nextInt(message.size());
        return message.get(random);
    }
}