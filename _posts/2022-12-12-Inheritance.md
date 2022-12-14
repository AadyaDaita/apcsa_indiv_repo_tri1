---
toc: true
layout: post
categories: [markdown]
title: Inheritance Notes
---

## Creating References usin Inheritance hierarcies
- Superclasses and subclasses are generally organized into a single root tree structure called an inheritance hierarchy. In this type of hierarchy, attributes and methods that are associated with a specific class are inherited by lower levels of the hierarchy.
- When working with a hierarchy of subclasses and superclasses, the object type and reference type can be different when instantiating an object variable.
 Example: Fruit fruit1 = new Apple(); In this case, the reference type is declared with the superclass, while the object type is declared with the subclass.


## Polymorphism
- Polymorphism can be used when we have multiple classes that are related by inheritance. It is utilized when a method is implemented to perform different tasks in different classes. It essentially allows a method to take on multiple “forms” or implementations based on the specific object it is acting upon.
- Polymorphism is useful for code reusability, as it re-implements an existing class’s attributes and methods for new classes. A real life example of polymorphism could be a sport. A sport can take on different forms, as it can be soccer, basketball, baseball, etc.


## Object Superclass
- The object superclass is located at the top of every class hierarchy. This means all of the other classes in a hierarchy can use the attributes and methods of the object superclass through inheritance. It is a part of the built-in java.lang package.
- The object superclass contains common, useful methods such as equals() and toString(). The equals() method compares two objects; it is often used to check for equality between 2 String objects, comparing each character of both strings to check if they are the same.





