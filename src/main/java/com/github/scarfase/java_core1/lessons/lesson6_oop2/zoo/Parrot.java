package com.github.scarfase.java_core1.lessons.lesson6_oop2.zoo;

public class Parrot extends Bird {
  public Parrot(String name, String color) {
    super(name, color);
  };

  public void speak() {
    System.out.printf("%s: 'parrot says aaaaa'\n", name);
  }
}
