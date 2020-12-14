package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1050, 1050);
        frame.setVisible(true);

        Shape[] F = new Shape[20];

        for (int i = 0; i < 20; i++) {
            double x = Math.random() * 1050;
            double y = Math.random() * 1050;
            double a = Math.random() * 255; // цвет
            double b = Math.random() * 255;
            double c = Math.random() * 255;
            double d = Math.random() * 200; // рарзмер 1
            double f = Math.random() * 200;
            double j = Math.random() * 10; // random

            int l = (int) j;
            if (l % 2 == 0) {
                F[i] = new Circle((int) x, (int) y, (int) a, (int) b, (int) c, (int) d);
            } else if (l % 2 != 0) {
                F[i] = new Rectangle((int) x, (int) y, (int) a, (int) b, (int) c, (int) d, (int) f);
            }
        }
        GUI G = new GUI(F);
        frame.add(G);
    }
}
