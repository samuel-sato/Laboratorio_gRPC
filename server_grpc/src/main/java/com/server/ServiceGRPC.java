package com.server;

import java.util.Map;

import io.grpc.stub.StreamObserver;
import proto.ContadorServiceGrpc.ContadorServiceImplBase;
import proto.Microservice.EmptyRequest;
import proto.Microservice.MicroserviceReq;
import proto.Microservice.MicroserviceRes;
import proto.Microservice.MicroserviceResConsultar;

public class ServiceGRPC extends ContadorServiceImplBase {

    private Contador contador;

    public ServiceGRPC(){
        this.contador = new Contador();
    }

    @Override
    public void incluir(MicroserviceReq request, StreamObserver<MicroserviceRes> responseObserver) {
        
        int incluir = contador.incluir(request.getPalavra());

        MicroserviceRes res = MicroserviceRes.newBuilder()
            .setResult(incluir) // 0 sucesso; 1 erro
            .build();

            //Adiciona mensage e retorna para client
            responseObserver.onNext(res);
            responseObserver.onCompleted();
    }

    @Override
    public void consultar(EmptyRequest request, StreamObserver<MicroserviceResConsultar> responseObserver) {
        
        System.out.println("Consultar");
        
        Map<String, Integer> map = contador.consultar();

        MicroserviceResConsultar res = MicroserviceResConsultar.newBuilder()
            .putAllData(map)
            .build();

        
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
    
}
