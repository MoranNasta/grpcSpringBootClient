package com.example.demo.grpc.client.controller;

import com.example.demo.grpc.client.service.ClientService;
import com.example.demo.grpc.client.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController
{
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/hello")
    public String greet(@RequestBody User message) {
        return clientService.sayHelloToUser(message);
    }

}
