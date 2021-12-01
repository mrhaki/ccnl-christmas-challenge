package nl.codecentric.xmascodechallenge.domain;

import java.awt.Color;
import java.awt.Graphics2D;

public class Firewood {

    private final int x;

    private final int y;

    public Firewood(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printToCanvas(Graphics2D g2d){
        g2d.setColor(Color.pink);
        g2d.fillRect(x, y, 100, 70);
        g2d.setColor(Color.black);
        g2d.fillRect(x+10, y+10, 80, 50);
        g2d.setColor(Color.red);
        g2d.fillRect(x+20, y+50, 10, 10);
        g2d.fillRect(x+30, y+40, 10, 10);
        g2d.fillRect(x+30, y+30, 10, 10);
        g2d.fillRect(x+40, y+20, 20, 10);
        g2d.fillRect(x+60, y+30, 10, 10);
        g2d.fillRect(x+60, y+40, 10, 10);
        g2d.fillRect(x+70, y+50, 10, 10);
        g2d.setColor(Color.pink);
        g2d.fillRect(x+40, y+30, 20, 10);
        g2d.fillRect(x+60, y+50, 10, 10);
        g2d.fillRect(x+30, y+50, 10, 10);
        g2d.setColor(Color.yellow);
        g2d.fillRect(x+40, y+40, 20, 20);
    }
}
