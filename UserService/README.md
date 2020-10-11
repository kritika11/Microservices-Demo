### Third Microservice : "User Service"

This microservice has a POST method which which takes a User object with firstName and lastName properties and returns a String response of concatenation of firstName and lastName. The service uses @EnableDiscoveryClient for other clients/servers to discover it.

For Example:

User user = new User("Jane", "Doe");

Response : Jane Doe

This service is called by ConsumerService to get the full username.