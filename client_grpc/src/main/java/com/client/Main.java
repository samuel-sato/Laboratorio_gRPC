package com.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.ContadorServiceGrpc;
import proto.ContadorServiceGrpc.ContadorServiceBlockingStub;
import proto.Microservice.EmptyRequest;
import proto.Microservice.MicroserviceReq;
import proto.Microservice.MicroserviceRes;
import proto.Microservice.MicroserviceResConsultar;

public class Main {
    public static void main(String[] args) {
        
        
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        ContadorServiceBlockingStub stub = ContadorServiceGrpc.newBlockingStub(channel);

        MicroserviceReq req = MicroserviceReq.newBuilder()
            .setPalavra("teste")
            .build();
        

        MicroserviceRes res = stub.incluir(req);


        EmptyRequest c = EmptyRequest.newBuilder().build();

        MicroserviceResConsultar resC = stub.consultar(c);

        System.out.println(resC.getDataMap());
        channel.shutdown();
    }
}