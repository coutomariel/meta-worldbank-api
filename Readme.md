# Worldbank-API


### Api de backend desenvolvida para desafio técnico de processo seletivo de devs trainnes no grupo meta.

###Está api foi desenvolvida utilizando java e Spring Boot, feign client spring cloud. 

### Para subir a app, a partir da raiz do projeto rode os comandos abaixo no terminal para fazer o build, criar e levantar o container do app

```
mvn clean install
sudo docker build -t spring-app .
sudo docker run -p 8080:8080 spring-app
```
#### Documentação do swagger disponível em - http://localhost:8080/swagger-ui.html#/
#### Coleção do postman disponível em -  https://www.getpostman.com/collections/6576a10308408175a911