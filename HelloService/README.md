### Second Microservice : "Hello Service"

This microservice has a GET endpoint which gives a String "hello" wrapped within ResponseEntity. The service uses @EnableDiscoveryClient for other clients/servers to discover it.

This service is called by ConsumerService to fetch the "hello" string. 