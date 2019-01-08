package com.test.dima.sort;

public class MergeSort extends Base {

    Comparable[] temp;

    public void sort(Comparable[] arr) {
        int n = arr.length;
        temp = new Comparable[arr.length];
        sort(arr, 0, n - 1);
    }

    private void sort(Comparable[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(Comparable[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            temp[k] = arr[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > high) {
                arr[k] = temp[i];
                i++;
            } else if (less(temp[i], temp[j])) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"s", "h", "t", "e", "x", "a", "m", "p", "l", "e"};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        mergeSort.show(arr);
        System.out.println(mergeSort.isSorted(arr));
    }
}
