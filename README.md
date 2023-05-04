
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
