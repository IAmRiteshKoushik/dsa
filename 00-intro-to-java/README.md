# Introduction to Java

## How Java works under the hood ?
There are 3 parts of Java code execution
1. .java file (human readable)
2. .class file(byt code)
3. Machine code(0 and 1)

## .java file (Human Readable Format)
This file is where the programmer writes all the code. There are certain 
naming conventions for this as Java is an Object Oriented Programming
Langage and 

## .class file (Byte Code)
This is the file we get after the Java compiler compiles the entire ".java" file.
Now, this code will not run directly on a system. Java needs a Java Virtual Machine (JVM) to
run this code. And this is one of the reasons why Java is called to be platform 
independent programming languages. A lot of cross-platform programs can be written
due to this feature. More on platform independence. 

## Machine Code (0s and 1s)
The ".class" file is interpreted line-by-line and then converted into 
Machine Code which is what the computer understands. This is basically the binary file
that other languages like C, C++ directly generate without having the 
intermediate step of creating a ".class" file.

That would be the bird's eye view of how Java works. Now, to understand a few key terms

# What is Platform Independence ?
* It means that bute code can run on all operating systems
* We need to convert source code to machine code so computer can understand
* Compiler helps in doing this by turning it into executable code
* This executable code is a set of instructions for the computer
* After compiling C/C++ code we get ".exe" file which is platform dependent. 
* In Java we get bytecode, JVM converts this into machine code
* Java is platform independent but JVM is platoform dependent

Next, we take a look at JDK

# JDK, JRE, JVM, JIT - Nested Diagram
```java
JDK (Java Development Kit) = JRE + Development Tools {
    JRE (Java Runtime Environment) = JVM + Library Classes {
        JVM (Java Virtual Machine){
            JIT (Just-in-time Compiler)
        }
    }
}
```

## JDK - Java Development Kit
* It provides an environment to develp and run the Java program
* It is a package which includes:
    * Development tools - to provide the environment
    * JRE - to execute your program
    * a compiler - javac
    * archiver - jar
    * docs generator - javadoc
    * interpreter/loader

## JRE - Java Runtime Environment


## Some Key Terms

## Compile Time

## Runtime

## JVM - Java Virtual Machine

## Working of Java Architecture

## JRE vs JVM

## Tools Required to Start Programming

## Closing Thoughts
