## Architecture

Our sample microservices-based system consists of the following modules:
- **student-service** - a module containing the first of our sample microservices that allows to perform CRUD operations on MongoDB repository of book's students
- **book-service** - a module containing the second of our sample microservices that allows to perform CRUD operations on MongoDB repository of books. It communicates with student-service and administrateur-service.
- **administrateur-service** - a module containing the third of our sample microservices that allows to perform CRUD operations on MongoDB repository of administrateurs. 
- **gateway-service** - a module that Spring Cloud Netflix Zuul for running Spring Boot application that acts as a proxy/gateway in our architecture.
- **discovery-service** - a module that depending on the example it uses Spring Cloud Netflix Eureka.
The following picture illustrates an approach to a contract and component testing in our sample architecture described above.

![architecture cloud](https://user-images.githubusercontent.com/62676613/150198358-72235b34-a876-4f6c-9aba-d6bfad2dd2bb.PNG)



- **config-service** - a module that uses Spring Cloud Config Server for running configuration server. https://github.com/rahmasakka/ConfigurationLibrary
![serverConfiguration](https://user-images.githubusercontent.com/62676613/150198370-4adf4841-1009-4358-8052-4d983d660cde.PNG)
