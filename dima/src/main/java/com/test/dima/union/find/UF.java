package com.test.dima.union.find;

public class UF {

    private int[] data;
    //private int[] sz;
    private int size;
    private int count;

    public UF(int n) {
        data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = i;
            //sz[i] = i;
        }
        size = n;
        count = n;
    }

    void union(int p, int q) {
        if(!connected(p, q)) {
            int dataP = find(p);
            int dataQ = find(q);
            for (int i = 0; i < size; i++) {
                if(data[i] == dataQ) {
                    data[i] = dataP;
                }
            }
            count--;
        }
    }

    private int find(int p) {
        if(p < size) {
            return data[p];
        }
        throw new UnsupportedOperationException();
    }

    boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    int count() {
        return count;
    }
}
