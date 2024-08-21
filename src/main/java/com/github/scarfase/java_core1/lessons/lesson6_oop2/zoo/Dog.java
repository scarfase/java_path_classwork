package com.github.scarfase.java_core1.lessons.lesson6_oop2.zoo;

public class Dog extends Animal {
  public Dog(String name, String color) {
    super(name, color);
  }

  @Override
  public void voice() {
    System.out.printf("%s bark\n", name);
  }

  public static void doSomethingStatic() {
    System.out.println("Static dog");
  }
}
