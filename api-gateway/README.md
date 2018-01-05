# api-gateway #

A gateway service that uses Netflix Zuul to forward requests to services.

With the microservices architecture, the data returned to a client often comes from different services. In theory, the client could make requests to each of the microservices and merge the result on a client side; but a much better aproach is to have a single entry point for all services known as an API Gateway. The API Gateway encapsulates the internal system architecture and provides an API that is tailored to each client.

![diagram](api-gateway.png)

## Building
```./gradlew build```

## API ##  

| METHOD | PATH | DESCRIPTION |
| ------ |----- |-------------|
