# Api Quarkus

Para criar o executavel para produção basta executar 

`./mvnw package -Dquarkus.package.jar.type=uber-jar`

Isso criará um arquivo com sufixo `-runner.jar` na pasta target

# Executar

Com ambiente java configurado, basta rodar:

`java -jar (nomeProjeto-versão)-runner.jar`


# Servidor GRPC 

Para compilar execute: 

`gcc -o servidor servidor.c microservice.pb-c.c -lgrpc -lprotobuf-c -lpthread`
