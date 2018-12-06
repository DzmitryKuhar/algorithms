package com.test.java.olya.binary_search;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utils {
  public static int getIntFromConsole(String message) {
    System.out.printf(message);
    Scanner scanner = new Scanner(System.in);
    int key = scanner.nextInt();
    System.out.println("The int is " + key);
    return key;
  }

  public static int[] getSortedArrayFromWhiteList(Path path) throws IOException {
    Scanner scanner = new Scanner(path);

    List<Integer> list = new ArrayList<>();
    while (scanner.hasNextInt()) {
      list.add(scanner.nextInt());
    }

    list.sort(Integer::compareTo);
    int[] array = list.stream().mapToInt(x->x).toArray();

    //just to see what we have read from the file
    System.out.println("Whitelist contents:");
    Arrays.stream(array).forEach(s -> System.out.print(s + " "));
    return array;
  }

  public static int[] getSortedArrayFromArgs(String[] args) {
    int[] standandInputList =
        Arrays.stream(args)
        .mapToInt(Integer::parseInt)
        .sorted()
        .toArray();
    System.out.println("The args: ");
    Arrays.stream(standandInputList).forEach(s -> System.out.print(s + " "));
    return standandInputList;
  }
}
