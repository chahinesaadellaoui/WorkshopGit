# WorkshopGit
Zoo Management Project
This project is a Java-based simulation for managing zoos. It implements object-oriented programming concepts, custom exception handling, polymorphism, interfaces, and enumerations as outlined in Prosits 2 to 9.

Available Scripts
In the project directory, you can run:

Tests
Manually test the following features:

Adding, searching, and removing animals in a zoo.
Validating custom exceptions:
ZooFullException
InvalidAgeException
DuplicateAnimalException
Build
Since this is a pure Java project, there is no complex build process like in React or Node.js projects. The javac compilation step is sufficient.

Features
Animal and Zoo Management
Add, remove, and search for animals in a zoo.
Compare two zoos to determine which has more animals.
Custom Exceptions
ZooFullException: Raised when the zoo exceeds its maximum capacity.
InvalidAgeException: Raised when an animal is created with a negative age.
DuplicateAnimalException: Raised when an animal with the same name is added twice.
Specialized Behaviors
Aquatic animals can swim (swim() method).
Dietary behaviors are defined via interfaces (Carnivore, Herbivore, Omnivore).
Specific classes like Dolphin and Penguin demonstrate polymorphism.
Project Structure
src/tn/esprit/gestionzoo/entities: Contains entity classes (Animal, Zoo, Aquatic, Terrestrial, etc.).
src/tn/esprit/gestionzoo/exceptions: Contains custom exception classes.
src/tn/esprit/gestionzoo/main: Contains the Main class to execute the application.
Links to Prosits
Each Prosit contains specific instructions that contributed to the development of this project. Explore the corresponding branch for each:

Prosit 2: Basic structure of Animal and Zoo classes, constructors, and displayZoo() method.
Prosit 3: Adding, searching, and removing animals; handling duplicates and full zoo capacity.
Prosit 4: Encapsulation, validation, and code organization into packages.
Prosit 5: Introduction of Aquatic and Terrestrial subclasses, polymorphism with swim() method.
Prosit 6: Advanced features such as managing aquatic animals and calculating maximum swimming depth.
Prosit 7: Custom exception handling (ZooFullException, InvalidAgeException).
Prosit 8: Dietary behaviors using interfaces and enumerations.

Learn More
Java Development
To learn Java, refer to the official documentation: Java Documentation.

Core Concepts Used
Polymorphism: Demonstrated with the swim() method and dietary interfaces.
Interfaces: Implemented through Carnivore, Herbivore, and Omnivore.
Exception Handling: Custom exceptions manage validation and error handling.
Troubleshooting
Common Issues
Compilation Errors
Error: unreported exception InvalidAgeException
Ensure that any constructors or methods that throw InvalidAgeException are wrapped in a try-catch block.

Error: cannot find symbol
Verify that class names and file paths are correct. Use the proper javac command to compile files in their respective directories.

Deployment
This project is designed to run locally using the Java Virtual Machine (JVM). No deployment is required. To run on a server, ensure the server has a compatible JVM installed.

Author
Chahine Saadellaoui: A computer science graduate 
License
This project is open source and can be freely modified and redistributed.
