package com.github.scarfase.java_core1.lessons.lesson3;

import java.util.Random;

public class MyArrayUtils {
  public static void printArray(int[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("]\n");
  }

  public static void printArray(float[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("]\n");
  }

  public static void printArray(double... arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("]\n");
  }

  public static void printDoubleArray(int[][] arr) {
    for (int y = 0; y < arr.length; y++) {
      System.out.print("[ ");
      for (int x = 0; x < arr[y].length; x++) {
        System.out.print(arr[y][x] + " ");
      }
      System.out.print("]");
      System.out.println();
    }
  }

  public static int[] makeArrayWithRandomValues(int length) {
    int[] arr = new int[length];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt();
    }
    return  arr;
  }
}
