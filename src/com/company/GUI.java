package com.company;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {

    public Shape[] F;

    public GUI(Shape[] d) {
        F = d;
    }

    public void paintComponent(Graphics b) {
        super.paintComponent(b);
        this.setBackground(Color.blue);

        for (int i = 0; i < 20; i++) {
            Shape Sh = F[i];
            b.setColor(new Color(Sh.B, Sh.B, Sh.C));
            int[] D = Sh.getSize();

            if(D.length == 2)
                b.fillRect(Sh.x,Sh.y, D[0], D[1]);
            if(D.length == 1)
                b.fillOval(Sh.x,Sh.y, D[0], D[0]);
        }
    }
}
