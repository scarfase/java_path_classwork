package com.github.scarfase.java_core1.lessons.lesson5_oop;

public class Cat {
  String name;
  String colour;
  int age;

  public Cat() {
    System.out.println("New cat born!");
  }

  public Cat(String colour) {
    this();
    this.colour = colour;
  }

  public Cat(String name, String colour, int age) {
    this(colour);
    this.name = name;
    this.age = age;
  }

  void run() {
    System.out.printf("%s %s-colored run\n", this.name, this.colour);
  }
  void voice() {
    System.out.printf("%s %s-colored meaww\n", this.name, this.colour);
  }
}
