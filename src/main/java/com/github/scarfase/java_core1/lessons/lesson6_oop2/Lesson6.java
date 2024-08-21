package com.github.scarfase.java_core1.lessons.lesson6_oop2;

import com.github.scarfase.java_core1.lessons.lesson6_oop2.zoo.*;

public class Lesson6 {
  public static void main(String[] args) {
    Cat cat = new Cat("Barsik", "black");
    Dog dog = new Dog("Bobik", "brown");
    Bird bird = new Bird("Chizik", "yellow");

    Animal[] animals = {
            new Cat("Barsik", "black"),
            new Dog("Bobik", "brown"),
            new Bird("Chizik", "yellow"),
            new Snake("Kaa", "green"),
            new Parrot("Kesha", "blue"),
    };

    for (int i = 0; i < animals.length; i++) {
      animals[i].walk();
      animals[i].voice();

      if (animals[i] instanceof Bird) {
        ((Bird) animals[i]).fly();
      }
      if (animals[i] instanceof Parrot) {
        ((Parrot) animals[i]).speak();
      }
    }

    Snake testSnake = new Snake("Snake", "gray");
    testSnake.walkAsParent();

    cat.doSomethingStatic();
    dog.doSomethingStatic();
    System.out.println(bird.TYPE);

//    cat.voice();
//    cat.walk();
//    dog.voice();
//    dog.walk();
//    bird.voice();
//    bird.walk();
  }
}
