package com.test.java.dima;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    int[] whiteLIst = intsFromFile(args[0]);
    Arrays.sort(whiteLIst);
    int[] blackLIst = intsFromFile(args[1]);
    for (int i = 0; i < blackLIst.length; i++) {
      boolean result = true;
      for (int j = 0; j < whiteLIst.length; j++) {
        if(blackLIst[i] == whiteLIst[j]) {
          result = false;
        }
      }
      if(result) {
        System.out.println(blackLIst[i]);
      }
    }
    System.out.println("Complete");
  }

  private static int[] intsFromFile(String filename) {
    try (
      Scanner sc = new Scanner(MainClass.class.getClassLoader().getResourceAsStream(filename),
        "UTF-8").useDelimiter("\\A")) {
      String file = sc.next();
      String[] strings = file.split("\\n");
      int[] ints = new int[strings.length];
      for (int i = 0; i < strings.length; i++) {
        ints[i] = Integer.parseInt(strings[i]);
      }
      return ints;
    }
  }
}
