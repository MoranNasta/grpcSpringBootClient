package com.example.demo.grpc.client.service;

import com.example.demo.grpc.client.model.User;
import grpc.greetings.Greetings;
import grpc.greetings.SayWelcomeServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
  private SayWelcomeServiceGrpc.SayWelcomeServiceBlockingStub sayWelcomeServiceGrpc;

    public ClientService(SayWelcomeServiceGrpc.SayWelcomeServiceBlockingStub sayWelcomeServiceGrpc) {
        this.sayWelcomeServiceGrpc = sayWelcomeServiceGrpc;
    }

    public String sayHelloToUser(User user) {

        Greetings.User request = Greetings.User.newBuilder()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .build();
        Greetings.WelcomeMessage reply = sayWelcomeServiceGrpc.sayHelloToUser(request);
        return reply.getWelcomeMessage();
    }

}
