package com.test.dima.union.find;

public class Main {
    public static void main(String[] args) {
        UF uf = new UF(10);
        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(9, 4);
        uf.union(2, 1);
        uf.union(8, 9);
        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);
        uf.union(1, 0);
        uf.union(5, 3);
        uf.union(6, 7);
    }
}
