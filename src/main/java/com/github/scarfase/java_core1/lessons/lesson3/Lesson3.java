package com.github.scarfase.java_core1.lessons.lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Lesson3 {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6,7};
    double[] arr2 = {1,2,3,4,5,6,7};
    MyArrayUtils.printArray(arr1);
    MyArrayUtils.printArray(arr2);
    MyArrayUtils.printArray(1,2,3,4,5,6,7,8,9);

    int[][] doubleArr = new int[3][];
    doubleArr[0] = new int[3];
    doubleArr[1] = new int[30];
    doubleArr[2] = new int[10];

    doubleArr[1][18] = 123;

    int[][] doubleArr2 = {{12,123,4}, {34,324,543,32,432,423,423}, {2,234,342,423,4}};

    MyArrayUtils.printDoubleArray(doubleArr);
    MyArrayUtils.printDoubleArray(doubleArr2);

    int[] randomArr = MyArrayUtils.makeArrayWithRandomValues(23);
    MyArrayUtils.printArray(randomArr);

//    System.out.println("Enter text to read: ...");
//    Scanner scanner = new Scanner(System.in);
//    scanner.useDelimiter("__");
//    String s = scanner.next();
//    System.out.println(s);
//    System.out.println("Enter a number: ...");
//    Scanner scanner = new Scanner(System.in);
//    scanner.useLocale(Locale.UK);
//    double numberFromScanner = scanner.nextDouble();
//    System.out.println(numberFromScanner);
    System.out.println("Read content from file: ");
    File file = new File("files/file_example.txt");
    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


  }
}
