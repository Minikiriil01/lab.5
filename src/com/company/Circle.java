package com.company;

public class Circle extends Shape {

    int[] d = new int[1];

    public Circle(int X, int Y, int A, int B, int C, int a) {
        super(X, Y, A, B, C);
        d[0] = a;
    }

    @Override
    public int[]
    getSize() {
        return d;
    }
}
