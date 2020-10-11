### First Microservice : "Consumer Service"

This microservice enables "Feign Clients" to communicate with the other two services. It makes use of proxy interfaces for both the services to use their data.

This service makes a POST request which in turn calls the HelloService and UserService to concat data and return "Hello Jane Doe".