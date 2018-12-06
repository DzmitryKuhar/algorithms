/*
 Добавьте в клиент тестирования BinarySearch возможность реагировать на второй аргумент:
 если он положителен, то должен выводить числа из стандартного ввода,
 которые отсутствуют в белом списке, а если отрицателен — которые присутствуют там.

11 22 33 44 55 66 77 88 99 - program arguments
 */

package com.test.java.olya.binary_search;

import java.io.IOException;
import java.nio.file.Paths;

public class BS_1_1_23 {
  public static void main(String[] args) throws IOException {

    int intFlag = Utils.getIntFromConsole("Enter positive or negative integer");
    boolean flag = intFlag >= 0;

    int[] arrayFromArgs = Utils.getSortedArrayFromArgs(args);

    int[] arrayFromFile = Utils.getSortedArrayFromWhiteList(
        Paths.get(".\\olya\\src\\main\\resources\\1.1.22"));

    System.out.println();
    process(arrayFromArgs, arrayFromFile, flag);
  }

  private static void process (int[] arrayFromArgs, int[] arrayFromFile, boolean flag){
    for (int i = 0; i < arrayFromArgs.length; i++) {
      int match = binarySearch(arrayFromFile, arrayFromArgs[i]);
      if(flag && match == -1) {
        System.out.println(arrayFromArgs[i]);
      }
      if(!flag && match != -1)
        System.out.println(arrayFromArgs[i]);
    }
  }

  private static int binarySearch(int[] array, int key) {
    int first = 0;
    int last = array.length - 1;
    int mid;
    while (true) {
      if(last < first) return  -1;
      mid = first + (last - first) / 2;
      if(key > array[mid]) {
        first = mid + 1;
      } else if (key < array[mid]){
        last = mid - 1;
      } else return mid;
    }
  }
}
