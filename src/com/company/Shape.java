package com.company;

public abstract class Shape {
int x,y;
int A,B,C;

public Shape(int X,int Y, int A, int B, int C){
x = X;
y = Y;
this.A=A;
this.B=B;
this.C=C;
}
public abstract int[] getSize();
}
