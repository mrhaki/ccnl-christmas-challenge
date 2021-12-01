package nl.codecentric.xmascodechallenge.domain;


import java.awt.Color;
import java.awt.Graphics2D;

public class Sock {

    private final int x;

    private final int y;

    public Sock(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printToCanvas(Graphics2D g2d) {
        g2d.setColor(Color.white);
        g2d.fillRect(x, y, 20, 10);
        g2d.setColor(Color.red);
        g2d.fillRect(x, y+10, 20, 20);
        g2d.fillRect(x, y+30, 30, 10);
    }
}
