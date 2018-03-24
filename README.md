# RMI-Currency-Converter
Java RMI currency convertor 


Use javac to compile all 4 programs.
 > javac Calculator.java
 > javac CalculatorImpl.java
 > javac CalculatorServer.java
 > javac CalculatorClient.java
Now use rmic to create the stub and skeleton class files.
 > rmic CalculatorImpl

 Start with the Registry. You must be in the directory that contains the classes you have written. From there, enter the following:
 > rmiregistry

 In the second console start the server hosting the CalculatorService, and enter the following:
 > java CalculatorServer

 In the last console, start the client program.
 > java CalculatorClient
