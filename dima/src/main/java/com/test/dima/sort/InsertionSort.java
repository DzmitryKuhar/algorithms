package com.test.dima.sort;

public class InsertionSort extends Base {

    public void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(arr[j], arr[j - 1])) {
                    exchange(arr, j, j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"b", "e", "d", "c", "a"};
        InsertionSort chooseSort = new InsertionSort();
        chooseSort.sort(arr);
        chooseSort.show(arr);
        System.out.println(chooseSort.isSorted(arr));
    }
}
