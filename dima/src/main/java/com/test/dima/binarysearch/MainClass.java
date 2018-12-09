package com.test.dima.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    int[] whiteLIst = intsFromFile(args[0]);
    Arrays.sort(whiteLIst);
    int[] blackLIst = intsFromFile(args[1]);
    for (int blackItem : blackLIst) {
      int index = binarySearch(whiteLIst, blackItem);
      if(index == -1) {
        System.out.println(blackItem);
      }
    }
    System.out.println("Complete");
  }

  private static void binarySearchDummy(int[] whiteLIst, int key) {
    boolean result = true;
    for (int whiteItem : whiteLIst) {
      if (key == whiteItem) {
        result = false;
      }
    }
    if (result) {
      System.out.println(key);
    }
  }

  private static int binarySearch(int[] whiteLIst, int key) {
    int low = 0;
    int high = whiteLIst.length - 1;
    while (true) {
      int middle = (high - low) / 2 + low;
      if(whiteLIst[low] == key) {
        return low;
      }
      if(whiteLIst[high] == key) {
        return high;
      }
      if(high - low <= 1) {
        return -1;
      }
      if(whiteLIst[middle] > key) {
        high = middle;
      } else {
        low = middle;
      }
    }
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
