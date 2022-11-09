---
toc: true
layout: post
categories: [markdown]
title: Unit 2 Notes
---

**Classes and Objects**

- A class is a blueprint for creating objects with the same behavior and defined attributes
- An object is a specific entity made from a class that you can manipulate in your programs
- Objects are instances of classes with variables used to name them
- Each object has behaviors and attributes that are defined by the class that was used to create it. 
- Each object is individual, changing one object doesn’t affect the others


**Contructors**
*Constructors* - initialize the attributes for an object

- Constructors start with public, and have the same name as the class. In this case, these constructors are for the class Person.

- The stuff in red is the formal parameters are creating the variables

- When creating an object, you would have to define those constructors - actual parameters:

<img src="images/notes1.png"/>


We can have more than one constructor for an object. This is called overloading the constructor. 
<img src="images/notes2.png"/>

The no-argument constructor has no parameters and sets the instance variables for the object to default values. This will set the constructor to whatever the default value is for that data type. 

<img src="images/notes3.png"/> 

Can have something like this. This is an example of multiple constructors:
<img src="images/notes4.png"/>