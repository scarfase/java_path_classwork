package com.github.scarfase.java_core1.lessons.lesson6_oop2.zoo;

public class Snake extends Animal {
  public Snake(String name, String color) {
    super(name, color);
  }
  @Override
  public void voice() {
    System.out.printf("%s: Ssssssh \n", name);
  }
  @Override
  public void walk() {
    System.out.printf("%s: crawling \n", name);
  }

  public void walkAsParent() {
    super.walk();
  }
}
