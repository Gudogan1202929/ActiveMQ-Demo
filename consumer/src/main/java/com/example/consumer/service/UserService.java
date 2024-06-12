package com.example.consumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @JmsListener(destination = "user-queue")
    public void receiveMessage(String user) {
        System.out.println("Received message: " + user);
    }
}
