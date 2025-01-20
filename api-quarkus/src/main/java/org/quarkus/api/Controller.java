package org.quarkus.api;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import main.java.org.quarkus.api.request;
import proto.ContadorServiceGrpc;
import proto.Microservice;

@Path("/contador")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Controller {

    @GET
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @POST
    public String incluir(request request){

        String palavra = request.getPalavra();

        if(palavra == null || palavra.isBlank())
            return "Palavra não informada";

        ManagedChannel channel = ManagedChannelBuilder.forAddress("192.168.122.218", 8999).usePlaintext().build();

        ContadorServiceGrpc.ContadorServiceBlockingStub stub = ContadorServiceGrpc.newBlockingStub(channel);

        if(request.getPalavra().equals("IMPRIMIR")){
            Microservice.EmptyRequest c = Microservice.EmptyRequest.newBuilder().build();

            Microservice.MicroserviceResConsultar resC = stub.consultar(c);

            channel.shutdown();
            return  resC.getDataMap().toString();
        }
        else {
            Microservice.MicroserviceReq req = Microservice.MicroserviceReq.newBuilder()
                    .setPalavra(palavra)
                    .build();

            Microservice.MicroserviceRes resC = stub.incluir(req);

            channel.shutdown();
            return  resC.getResult() == 0? "Sucesso": "Erro";
        }
    }
}
