# Laboratório gRPC

## Apresentação

[Vídeo](https://drive.google.com/file/d/1wior991FqGSKC6uh_6XVBmKPvaDjTXVj/view?usp=sharing)
## Alunos

| Matrícula  | Aluno                          |
| ---------- | ------------------------------ |
| 20/2015984 | Breno Henrique de Souza        |
| 18/0121308 | Giulia Domingues de Alcantara  |
| 20/0069322 | Samuel Alves Sato              |
| 19/0087439 | Gabriel de Souza Fonseca Ribeiro |
| 19/0020521 | Valderson Pontes da Silva Junior |


## Manual

### Instalação

Para rodar o projeto, você precisará configurar o servidor e o cliente em máquinas diferentes (ou na mesma máquina, caso deseje testar localmente). Siga as instruções de instalação para cada máquina:

#### Máquina Virtual 1 (vm01) - Servidor

1. Faça o **download** do arquivo `.jar` do servidor gRPC:

   [Download do servidor gRPC](https://github.com/samuel-sato/Laboratorio_gRPC/blob/main/server_grpc/target/server_grpc-1.0-SNAPSHOT.jar)

2. Abra o terminal na máquina virtual 1 (vm01) e navegue até o diretório onde o arquivo `.jar` foi baixado.

3. Execute o seguinte comando para iniciar o servidor:

   ```bash
   java -jar server_grpc-1.0-SNAPSHOT.jar


#### Máquina Virtual 2 (vm02) - Client

1. Faça o **download** do arquivo `.jar` do servidor gRPC:

   [Download do jar do client](https://github.com/samuel-sato/Laboratorio_gRPC/blob/main/api-quarkus/target/api-quarkus-1.0.0-SNAPSHOT-runner.jar)
   
2. Abra o terminal na máquina virtual 2 (vm02) e navegue até o diretório onde o arquivo `.jar` foi baixado.

3. Execute o seguinte comando para iniciar o servidor:

   ```bash
   java -jar Desktop/api-quarkus-1.0.0-SNAPSHOT-runner.jar


#### Máquina local

Para testar a API localmente, você pode usar o seguinte comando curl para enviar uma requisição POST ao servidor:

    curl: curl -X POST http://192.168.122.248:8080/contador \
    -H "Content-Type: application/json" \
    -d '{"palavra": "IMPRIMIR"}'



### Uso

O servidor gRPC recebe palavras via requisição POST e executa ações com base na palavra enviada. Quando a palavra "IMPRIMIR" é enviada, será impresso no console o dicionário (lista de palavras adicionadas). Caso contrário, a palavra será adicionada a um dicionário e o contador para essa palavra será atualizado.


### Manual

1. **Imprimir dicionário**:  
   Envie a palavra "IMPRIMIR" para o servidor. A resposta será vazia `{}`, indicando que a palavra foi apenas processada (impressa).

   ```bash
   curl -X POST http://192.168.122.248:8080/contador \
   -H "Content-Type: application/json" \
   -d '{"palavra": "IMPRIMIR"}'

2. **Adicionar palavra**:  
    Envie a palavra "PSPD" para o servidor. A resposta será `{Sucesso!}`, indicando que a palavra foi adicionada.

   ```bash
   curl -X POST http://192.168.122.248:8080/contador \
   -H "Content-Type: application/json" \
   -d '{"palavra": "PSPD"}'

3. **Imprimir dicionário**:  
    Envie a palavra "IMPRIMIR" para o servidor. A resposta será a lista de palavras adicionadas ao dicionário. Exemplo: `{PSPD=1}`.

   ```bash
   curl -X POST http://192.168.122.248:8080/contador \
   -H "Content-Type: application/json" \
   -d '{"palavra": "IMPRIMIR"}'
