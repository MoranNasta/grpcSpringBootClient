package com.example.demo.grpc.client;

import grpc.greetings.SayWelcomeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    @Bean
    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();
    }

    @Bean
    public SayWelcomeServiceGrpc.SayWelcomeServiceBlockingStub greeterBlockingStub(ManagedChannel managedChannel) {
        return SayWelcomeServiceGrpc.newBlockingStub(managedChannel);
    }
}
