package com.company;

public class Rectangle extends Shape {

int ab[] = new int[2];

public Rectangle(int X,int Y, int A, int B, int C, int W, int H){

super(X,Y,A,B,C);
ab[0] =W;
ab[1] = H;
}
@Override
public  int[] getSize(){
    return ab;
}
}
