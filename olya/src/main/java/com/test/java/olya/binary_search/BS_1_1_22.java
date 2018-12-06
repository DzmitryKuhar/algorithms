/*
  Напишите версию программы BinarySearch, в которой задействован рекурсивный метод rank(),
  приведенный в листинге 1.1.1, и выполняется трассировка вызовов этого метода.
  При каждом вызове рекурсивного метода он должен выводить значения 1о и hi с отступом слева,
   соответствующим глубине рекурсии. Совет: добавьте в метод дополнительный аргумент,
   который будет отслеживать глубину рекурсии.
 */

package com.test.java.olya.binary_search;

import java.io.IOException;
import java.nio.file.Paths;

public class BS_1_1_22 {

  public static void main(String[] args) throws IOException {
    int key = Utils.getIntFromConsole("Enter key");
    int[] whiteList = Utils.getSortedArrayFromWhiteList(Paths.get(".\\olya\\src\\main\\resources\\1.1.22"));
    System.out.println(BS_1_1_22.rank(key, whiteList));
  }

  private static String deep = "";

  private static String incrementDeep(){
    return deep += " ";
  }

  public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1);
  }

  public static int rank(int key, int[] a, int lo, int hi) {
    if (lo > hi)
      return -1;
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) {
      System.out.println(incrementDeep() + "lo");
      return rank(key, a, lo, mid - 1);
    } else if (key > a[mid]) {
      System.out.println(incrementDeep() + "hi");
      return rank(key, a, mid + 1, hi);
    }
    else
      return mid;
  }
}