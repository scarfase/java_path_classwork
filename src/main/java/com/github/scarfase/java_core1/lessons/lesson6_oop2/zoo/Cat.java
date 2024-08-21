package com.github.scarfase.java_core1.lessons.lesson6_oop2.zoo;

public class Cat extends Animal {
  public Cat(String name, String color) {
    super(name, color);
  }

  @Override
  public void voice() {
    System.out.printf("%s meaw\n", name);
  }

}
