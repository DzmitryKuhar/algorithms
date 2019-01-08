package com.test.dima.sort;

public class ChooseSort extends Base {

    public void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            exchange(arr, i, min);
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"b", "a", "d", "c"};
        ChooseSort chooseSort = new ChooseSort();
        chooseSort.sort(arr);
        chooseSort.show(arr);
        System.out.println(chooseSort.isSorted(arr));
    }
}
