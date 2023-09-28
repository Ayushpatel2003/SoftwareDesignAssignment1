Repository Name: Grocery Store Java Application
Description

This repository contains a Java application for managing a grocery store's product inventory. The application utilizes the factory design pattern to create various grocery products and interact with them. Additionally, it includes a product list stored in a text file for reference.

Summary of Code Files:Main.java:The code is reading a product list from a file, creating product objects based on the data in the file, and setting their prices using a factory patternApple.java / Bananajava / UnripeApple.java / UnripeBanana.java:This code creates an instance of UnripeApple, UnripeBanana, Apple and Banana, sets its price, and then retrieves and prints its name and price.ProductFactoryProducer.javaObtain's the appropriate factory, and then use that specific factory (RipeProdctFactory / UnripeProductFactory) to create instances of specific products

Repository Structure

The repository is organized into the following folders and files:
1. src Folder

The src folder contains all Java source code files that make up the grocery store application:

    Apple.java: This Java file defines the Apple class, representing a specific grocery product (in this case, apples).
    Banana.java: Similar to Apple.java, this file defines the Banana class for bananas.
    GroceryProductFactory.java: This Java file contains the implementation of the factory pattern for creating various grocery products.
    main.java: The main entry point of the application, where program execution begins.
    Product.java: This file defines the Product interface, which is implemented by specific grocery product classes like Apple and Banana.
    Test.java: A Java file containing unit tests or test cases for the grocery store application.

2. product_list.txt File

The product_list.txt file, located in the src folder, contains a list of products available in the grocery store. Each line in the text file consists of two columns:

    The left column represents the product name.
    The right column represents the price of the product.

3. UML Diagram

The UML diagram for this grocery store application can be found in the src folder with the filename UML_Assignment1.png. This diagram provides a visual representation of the class relationships and structure of the application, making it easier to understand the interactions between different classes and objects.

Application Overview

The Java application in this repository is designed to demonstrate the factory pattern for creating grocery products. When executed, the main.java file is responsible for initiating the application and interacting with various grocery products such as apples and bananas.

The GroceryProductFactory.java class is crucial for creating instances of specific grocery products, allowing for easy extensibility when adding new product types to the store.
Usage

4. OUTPUT OF THE TEST CODE: 

![image](https://github.com/Ayushpatel2003/SoftwareDesignAssignment1/assets/124087552/5708ce9b-67a5-43d0-9355-951c83cc691d)



To run the grocery store application, compile the Java source files and execute the main.java file. This application will read the product list from product_list.txt and demonstrate the factory pattern by creating and working with different grocery products.

Feel free to modify the product list or extend the application to include additional grocery product types as needed.
