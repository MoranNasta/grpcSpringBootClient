package com.example.demo.grpc.client;

import com.example.demo.grpc.client.model.User;
import grpc.greetings.Greetings;
import grpc.greetings.SayWelcomeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class ApplicationCompareGrpcHttp {

    public static void main(String[] args) {

        int iterations=10000;

        ManagedChannel managedChannel =
                ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build();

        SayWelcomeServiceGrpc.SayWelcomeServiceBlockingStub greeterBlockingStub = SayWelcomeServiceGrpc.newBlockingStub(managedChannel);


        User user = new User("moran", "nasta");
        Greetings.User request = Greetings.User.newBuilder()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .build();


        final String uri = "http://localhost:8080/users/all";

        RestTemplate restTemplate = new RestTemplate();

        AtomicLong timeBeforeHttp=new AtomicLong();

        AtomicLong timeAfterHttp=new AtomicLong();
        AtomicLong timeBeforeGrpc=new AtomicLong();
        AtomicLong timeAfterGrpc=new AtomicLong();


        Runnable taskGRPC =()->
        {
            timeBeforeGrpc.set(System.currentTimeMillis());
            for (int i = 0; i < iterations; i++) {
                Greetings.Empty empty = null;
                //Greetings.WelcomeMessage reply = greeterBlockingStub.sayHelloToUser(request);
                Greetings.ListOfUsers users = greeterBlockingStub.getListUsersPayload(empty);
                System.out.println(users.getUsersCount()+"GRPC");
            }
            timeAfterGrpc.set(System.currentTimeMillis());
        };
        Runnable taskHttp =()->
        {
            timeBeforeHttp.set(System.currentTimeMillis());
            for(int i = 0; i < iterations; i++) {
                Object result = restTemplate.getForObject(uri, Object.class);
                System.out.println(i+"HTTP");
            }
            timeAfterHttp.set(System.currentTimeMillis());
        };

        Thread threadGrpc=new Thread(taskGRPC);
        Thread threadHttp=new Thread(taskHttp);
        threadHttp.start();
        threadGrpc.start();
        System.out.println("Both |Threads started successfully");
        try {
            threadGrpc.join();
            threadHttp.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("time for grpc: "+(timeAfterGrpc.get()-timeBeforeGrpc.get()));
        System.out.println("time for http: "+(timeAfterHttp.get()-timeBeforeHttp.get()));
    }


}
