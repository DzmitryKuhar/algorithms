package com.test.dima.sort;

public class ShellSort extends Base {

    public void sort(Comparable[] arr) {
        int n = arr.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h +1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h; j-=h) {
                    if (less(arr[j], arr[j - h])) {
                        exchange(arr, j, j - h);
                    }
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"s", "h", "e", "l", "l", "s", "o", "r", "t", "e", "x", "a", "m", "p", "l", "e"};
        ShellSort chooseSort = new ShellSort();
        chooseSort.sort(arr);
        chooseSort.show(arr);
        System.out.println(chooseSort.isSorted(arr));
    }
}
