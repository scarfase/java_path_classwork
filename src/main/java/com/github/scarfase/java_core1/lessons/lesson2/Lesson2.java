package com.github.scarfase.java_core1.lessons.lesson2;

public class Lesson2 {
  public static void main(String[] args) {
    System.out.println("if's");
    calculateSomeExpression(20.0, 10.0);
    vendingWithIfs();
    vendingWithSwitch();
    vendingWithSwitchModern();
    loopsWhile();
    loopsFor();
    arrays();
  }

  public static double calculateSomeExpression(double firstValue, double secondValue) {
    double result = firstValue / secondValue;
    String s = String.format("First value: %.02f; second value: %f; result is: %f\n", firstValue, secondValue, result);
    System.out.println(s);
    return result;
  }

  public static void vendingWithIfs() {
    int choice = 2;
    if (choice == 1) {
      System.out.println("Give lays");
    } else if (choice == 2) {
      System.out.println("Give cola");
    } else {
      System.out.println("Try again");
    }
  }

  public static  void vendingWithSwitch() {
    int choice = 22222;
    switch (choice) {
      case 1:
      case 33:
      case 58:
        System.out.println("Give lays");
        break;
      case 2, 77, 88:
        System.out.println("GIve cola");
        break;
      default:
        System.out.println("Try again");
    }
  }

  public static  void vendingWithSwitchModern() {
    int choice = 43;
    switch (choice) {
      case 1, 43, 34 -> System.out.println("Give lays");
      case 2 -> System.out.println("GIve cola");
      default -> {
        System.out.println("Try again");
        System.out.println("Double lines");
      }
    }
  }

  public static void loopsWhile() {
    int counter = 1;
    while (counter < 51) {
      counter++;
      if (counter % 3 == 0) {
        continue;
      }
      System.out.println(counter);
      if (counter == 31) {
        System.out.println("Breaking...");
        break;
      }
    }
    int counter2 = 1;
    while (true) {
      System.out.println("While true loop running before break: " + counter2);
      counter2++;
      if (counter2 == 31) {
        System.out.println("Breaking...");
        break;
      }
    }

    int counterDo = 1;
    do {
      System.out.println("counterDo before while: " + counterDo);
    } while (counterDo < 0);
  }


  public static void loopsFor() {
    exampleLabel: //label not recommended
    for (int i = 0; i < 10; i++) {
      System.out.printf("Exercise # %d: ", i);
      for (int j = 1; j < 11; j++) {
        System.out.print(j + " ");
        if (j == 4) {
          break exampleLabel;
        }
      }
    }
    System.out.println();
  }

  public static  void arrays() {
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 30;
    arr[2] = 40;
    arr[3] = 50;
    arr[4] = 1110;
    System.out.println(arr[4]);

    int[] arr1 = {1,2,3,5,666,777};

    for (int i = 0; i < arr1.length; i++) {
      System.out.println(i + " Array " + arr1[i]);
    }

    for (int i = arr1.length - 1; i >= 0; i--) {
      System.out.println("Array in back " + arr1[i]);
    }

    String[] strings = {
            "Mondey",
            "Thuestday",
            "Sunday"
    };
    System.out.println("For each example");
    for (String s : strings) {
      System.out.println(s);
    }
  }
}
