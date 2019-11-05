package org.courses;

import java.awt.*;

public class SmallBacterium extends Bacterium {


    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        {
            g.setColor(color);
            g.fillOval(x, y, width, height);
        }
    }
}
