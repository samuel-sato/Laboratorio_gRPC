package com.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
    public static void main(String[] args) {

        try {
            Server server = ServerBuilder.forPort(8999)
            .addService(new ServiceGRPC())
            .build();


            server.start();

            System.out.println("Server started at " + server.getPort());
            server.awaitTermination();    
        } catch (Exception e) {
            System.out.println("========= ERRO =========");
            System.out.println(e.getMessage());
        }
        
        
        // Contador contador = new Contador();

        // contador.incluir("casa");
        // contador.incluir("casa");
        // contador.incluir("casa");

        // contador.incluir("carro");
        // contador.incluir("teste");
        // contador.incluir("aprender");

        // Map<String, Integer> map = contador.consultar();
        // System.out.println(map);
    }
}