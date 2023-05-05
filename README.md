
# Design Patterns

The reason for this project is simply to get back to basics. 
I know what you might be thinking. "Why would an experienced engineer include this in their portfolio?" While I admit 
I am expected to know these patterns, it never hurts to go back to basics and re-learn things especially after years of 
not using these design approaches.

## Advantages of design patterns

- They are reusable in multiple projects.
- They provide the solutions that help to define the system architecture.
- They capture the software engineering experiences.
- They provide transparency to the design of an application.
- They are well-proved and testified solutions since they have been built upon the knowledge and experience of expert 
software developers.
- Design patterns don?t guarantee an absolute solution to a problem. They provide clarity to the system architecture 
and the possibility of building a better system.

## When to use design patterns
- During the analysis and requirement phase of SDLC(Software Development Life Cycle).

## Core Java Design Patterns
- Mainly three types of design patterns
- Creational Patterns
- Structural Patterns
- Behavioural Patterns

## Creational Patterns

### Factory Pattern   

 - Define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
 - In other words, subclasses are responsible to create the instance of the class

#### Advantage of Factory Design Pattern

- Factory Method Pattern allows the sub-classes to choose the type of objects to create.
- It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.

#### Usage of Factory Design Pattern

- When a class doesn't know what sub-classes will be required to create
- When a class wants that its sub-classes specify the objects to be created.
- When the parent classes choose the creation of objects to its sub-classes.

### Abstract Factory Pattern

- Define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.
- Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
- An Abstract Factory Pattern is also known as Kit.

#### Advantage of Abstract Factory Pattern

- Abstract Factory Pattern isolates the client code from concrete (implementation) classes
- It eases the exchanging of object families.
- It promotes consistency among objects.

#### Usage of Abstract Factory Pattern
- When the system needs to be independent of how its object are created, composed, and represented.
- When the family of related objects has to be used together, then this constraint needs to be enforced.
- When you want to provide a library of objects that does not show implementations and only reveals interfaces.
- When the system needs to be configured with one of a multiple family of objects.


### Singleton Design Pattern

- Define a class that has only one instance and provides a global point of access to it.
- A class must ensure that only single instance should be created and single object can be used by all other classes.
- Two forms of singleton design pattern
  - **Early Instantiation**: creation of instance at load time.
  - **Lazy Instantiation**: creation of instance when required.

#### Advantage of Singleton design pattern

- Saves memory because object is not created at each request. Only single instance is reused again and again.

#### Usage of Singleton design pattern

- Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.


### Prototype Design Pattern

- Cloning of an existing object instead of creating new one and can also be customized as per the requirement.
- Copy existing objects without making your code dependent on their classes.

#### Advantage of Prototype Pattern

- It reduces the need of sub-classing.
- It hides complexities of creating objects.
- It lets you add or remove objects at runtime.
- The clients can get new objects without knowing which type of object it will be.

#### Usage of Prototype Pattern

- When the classes are instantiated at runtime. 
- When the cost of creating an object is expensive or complicated. 
- When you want to keep the number of classes in an application minimum. 
- When the client application needs to be unaware of object creation and representation.