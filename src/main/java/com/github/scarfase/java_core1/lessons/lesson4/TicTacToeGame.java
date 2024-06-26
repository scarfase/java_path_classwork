package com.github.scarfase.java_core1.lessons.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
  private static final char DOT_X = 'X';
  private static final char DOT_O = 'O';
  private static final char DOT_EMPTY = '.';
  private static final Scanner scanner = new Scanner(System.in);
  private static final Random random = new Random();
  private static char[][] field;
  private static char dotHuman;
  private static char dotAi;
  private static int fieldSizeX;
  private static int fieldSizeY;
  private static int scoreHuman;
  private static int scoreAi;
  private static int roundCounter;

  public static void main(String[] args) {
    play();
  }
  private static void play() {
    while (true) {
      chooseTheDot();
      playRound();
      System.out.printf("SCORE:  HUMAN     AI\n" +
              "            %d       %d\n", scoreHuman, scoreAi);
      System.out.print("Wanna play again? Y or N >>> ");
      if (!scanner.next().toLowerCase().equals("y")) {
        System.out.println("Good bye!");
        break;
      }
    }
  }
  private static void playRound() {
    System.out.printf("ROUND %d START\n", ++roundCounter);
    initField(3, 3);
    printField();
    if (dotHuman == DOT_X) {
      humanFirstTurn();
    } else {
      aiFirstTurn();
    }
  }
  private static void aiFirstTurn() {
    while (true) {
      aiTurn();
      printField();
      if (checkGame(dotAi)) break;
      humanTurn();
      if (checkGame(dotHuman)) break;
      printField();

    }
  }
  private static void humanFirstTurn() {
    while (true) {
      humanTurn();
      printField();
      if (checkGame(dotHuman)) break;
      aiTurn();
      printField();
      if (checkGame(dotAi)) break;
    }
  }
  private static void chooseTheDot() {
    System.out.print("If you want to play with 'X' then enter 'X' otherwise enter anything >>> ");
    if (scanner.next().toLowerCase().equals("x")) {
      dotHuman = DOT_X;
      dotAi = DOT_O;
    } else {
      dotHuman = DOT_O;
      dotAi = DOT_X;
    }
  }
  private static boolean checkGame(char dot) {
    if (checkWin(dot)) {
      if (dot == dotHuman) {
        System.out.println("Human win!!!");
        scoreHuman++;
      } else {
        System.out.println("AI win!!!");
        scoreAi++;
      }
      return true;
    }
    if (checkDraw()) return true;
    return false;
  }
  private static void aiTurn() {
    int x;
    int y;
    do {
      x = random.nextInt(fieldSizeX);
      y = random.nextInt(fieldSizeY);
    } while (!isCellEmpty(y, x));
    field[y][x] = dotAi;
  }

  private static void humanTurn() {
    int x;
    int y;
    do {
      System.out.print("Please enter coordinates of your turn x and y, split by whitespace >>> ");
      x = scanner.nextInt() - 1;
      y = scanner.nextInt() - 1;
    } while (!isCellValid(y, x) || !isCellEmpty(y, x));
    field[y][x] = dotHuman;
  }
  private static boolean checkWin(char dot) {
    // horizontal
    if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
    if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
    if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
    // vertical
    if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
    if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
    if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
    // diagonal
    if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
    if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;
    return false;
  }
  private static boolean checkDraw() {
    for (int y = 0; y < fieldSizeY; y++) {
      for (int x = 0; x < fieldSizeX; x++) {
        if (isCellEmpty(y, x)) return false;
      }
    }
    System.out.println("It's DRAW!!!");
    return  true;
  }
  private static boolean isCellEmpty(int y, int x) {
    return field[y][x] == DOT_EMPTY;
  }
  private static boolean isCellValid(int y, int x) {
    return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
  }
  private static void initField(int sizeX, int sizeY) {
    fieldSizeX = sizeX;
    fieldSizeY = sizeY;
    field = new char[fieldSizeY][fieldSizeX];
    for (int y = 0; y < fieldSizeY; y++) {
      for (int x = 0; x < fieldSizeX; x++) {
        field[y][x] = DOT_EMPTY;
      }
    }
  }

  private static void printField() {
    System.out.print("+");
    for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
      System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
    }
    System.out.println();
    for (int i = 0; i < fieldSizeY; i++) {
      System.out.print(i + 1 + "|");
      for (int j = 0; j < fieldSizeX; j++) {
        System.out.print(field[i][j] + "|");
      }
      System.out.println();
    }
    for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
      System.out.print("_");
    }
    System.out.println();
  }


}
