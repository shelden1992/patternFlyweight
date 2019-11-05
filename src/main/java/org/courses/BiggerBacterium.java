package org.courses;

import java.awt.*;

public class BiggerBacterium extends Bacterium {
    private static final int SIZE_COEFF = 4;

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.fillOval(SIZE_COEFF * x, SIZE_COEFF * y, SIZE_COEFF * width, SIZE_COEFF * height);
    }
}
