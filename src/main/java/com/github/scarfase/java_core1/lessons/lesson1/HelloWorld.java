package com.github.scarfase.java_core1.lessons.lesson1;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    printHelloWorld();
    // variables
    byte byteVariable;
    byteVariable = 120;
    System.out.println(byteVariable);
    short shortVar = 90;
    int integerVar = 2_145_777_777;
    long longVar = 1_999_888_777_666L;

    double doubleVar = 10.777;
    float floatVar = 3.14f;

    char charVar = 87;
    System.out.println(charVar);
    char charVar1 = 'D';
    char charVar2 = '\u2318';
    System.out.println(charVar1);
    System.out.println(charVar2);

    boolean boolVar = true;

    System.out.println("difference between float and double");
    float f = 10.0f / 3;
    double d = 10.0 / 3;
    System.out.println("Double: " + d);
    System.out.println("Float: " + f);

    // Create string from constructor
    String stringVar = new String("Some string");
    // Or
    String s = "Some string s";

    int q = 15;
    boolean b = q < 10;

    if (!b) {
      System.out.println("Hello");
    } else if (q == 2) {
      System.out.println("Two");
    } else if (q < 10) {
      System.out.println("q < 10");
    } else {
      System.out.println("End of if");
    }

  }

  public static void printHelloWorld() {
    System.out.println("Hello World from method");
    System.out.println("Hello World from method");
    System.out.println("Hello World from method");
    System.out.println("Hello World from method");
  }
}
