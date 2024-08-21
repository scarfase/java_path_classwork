package com.github.scarfase.java_core1.lessons.lesson6_oop2.zoo;

public abstract class Animal {
  public static final String TYPE = "ANIMAL";
  protected String name;
  protected String color;

  public Animal() {
    System.out.println("Animal born");
  }

  public Animal(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public static void doSomethingStatic() {
    System.out.println("Static!");
  }

  public void walk() {
    System.out.printf("%s walks on paws\n", name);
  }

  public abstract void voice();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
