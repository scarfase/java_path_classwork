package com.github.scarfase.java_core1.lessons.lesson5_oop;

import java.time.Year;

public class Cat2 {
  public static String type = "CAT";
  private String name;
  private String colour;
  private int birthYear;

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public String getColour() {
    return colour;
  }

  public int getAge() {
    return Year.now().getValue() - this.birthYear;
  }

  @Override
  public String toString() {
    return String.format("Cat %s colour: %s age: %d", name, colour, getAge());
  }

  public Cat2() {
    System.out.println("New cat born!");
  }

  public Cat2(String colour) {
    this();
    this.colour = colour;
  }

  public Cat2(String name, String colour, int age) {
    this(colour);
    this.name = name;
    this.birthYear = Year.now().getValue() - age;
  }

  void run() {
    System.out.printf("%s %s-colored run\n", this.name, this.colour);
  }
  void voice() {
    System.out.printf("%s %s-colored meaww\n", this.name, this.colour);
  }
}
