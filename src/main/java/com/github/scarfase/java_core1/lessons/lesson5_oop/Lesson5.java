package com.github.scarfase.java_core1.lessons.lesson5_oop;

public class Lesson5 {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.name = "Murzik";
    cat1.colour = "white";
    cat1.age = 3;

    System.out.println(cat1);
    System.out.println(cat1.name);
    System.out.println(cat1.colour);
    System.out.println(cat1.age);

    Cat cat2 = new Cat("Barsik", "black", 4);
    System.out.println(cat2.name);
    System.out.println(cat2.colour);
    System.out.println(cat2.age);

    new Cat();

    cat1.run();
    cat1.voice();
    cat2.run();
    cat2.voice();

    Cat2 cat3 = new Cat2();
    cat3.setName("Hrundik");
    System.out.println(cat3);
    System.out.println(cat3.type);
    cat3.type = "flkasjflj";
    System.out.println(cat3.type);

    Cat2 cat4 = new Cat2();
    cat4.setName("Harurik");
    System.out.println(cat4);
    System.out.println(cat4.type);
  }
}
