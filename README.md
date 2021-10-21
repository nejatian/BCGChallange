# BCGChallange

## Requirements
`Java 11`

## Running 
Run project using the following commands  
Using default file in assessment:
```shell
mvn -q spring-boot:run 
```
## Tests
```shell
mvn test
```
## Structure
I used Hexagonal architecture (or ports and adapters architecture) as the architectural pattern of the project.
There are four separated layers which are as below:

### Presentation
This layer contains the user interface for getting input data from the client, passing it as a command or query request to the application layer, and format results for the client and pass it as a response.
### Application
This is where business use cases are located. Request from the presentation layer is processed here, communicating with the core layer and calls to the infrastructure layer happen in this layer.
### Core
Core business rules, logics, and invariants are in this layer. This layer is developed using the Model-Driven Design approach.
### Infrastructure
Any communication with the outer world and concrete implementation of ports from higher layers locate here.

## Testing
The project is developed using Test-Driven Design approach. As a result of a layered architecture without direct dependencies between layers, I was able to test each layer in full isolation. In the heart of the system, the core layer is covered by detailed and fast feedback unit tests with 100% of coverage.
Although the layered architecture allowed me to mock other layers and write isolated unit tests for each layer as well, I preferred to cover Application, presentation, and infrastructure layers are by integration tests in order to have more valuable tests by having a higher chance of catching a regression.

## Improvements
Exceptions are not handeled.
There should be some improvements in Service class (application layer).
BDD testing should be add to the project.


