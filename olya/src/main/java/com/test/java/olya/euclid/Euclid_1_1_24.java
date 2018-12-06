/*Приведите последовательность значений р и q, вычисляемые при работе алгоритма Евклида,
когда он находит наибольший общий делитель 105 и 24. Напишите на основе кода,
приведенного на рис. 1.0.1, программу Euclid, которая принимает из командной строки два
целых числа и вычисляет их наибольший общий делитель, выводя оба аргумента для каждого
вывода рекурсивного метода.
105>24>9>6>3
Используйте полученную программу для вычисления наибольшего общего делителя 1111111 и 1234567.*/

package com.test.java.olya.euclid;

public class Euclid_1_1_24 {
  public static void main(String[] args) {
    System.out.println(gcd(105, 24));
  }

  private static int gcd (int n, int m) {
    if (m > n) {
      System.out.print(m + ">");
      if ((m % n) == 0) return n;
      else return gcd(n, m % n);
    } else {
      System.out.print(n + ">");
      if ((n % m) == 0)
        return m;
      else
        return gcd(m, n % m);
    }
  }
}
