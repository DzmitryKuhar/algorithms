package com.test.java.olya.recursion;

class Factorial {
  // рекурсивный метод
  int fact(int n) {
    System.out.println(n);
    int result;
    if (n == 1)
      return 1;
    result = fact(n - 1) * n;
    return result;
  }

  public static void main(String[] args) {
    Factorial f = new Factorial();
    System.out.println(f.fact(5));
  }
}