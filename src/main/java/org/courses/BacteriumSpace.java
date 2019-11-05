package org.courses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BacteriumSpace extends JFrame {
    private static final BacteriumType[] BACTERIUM_TYPES = {BacteriumType.MIDDLE, BacteriumType.SMALL, BacteriumType.BIG, BacteriumType.BIGGER};
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.YELLOW};
    private final int WIDTH;
    private final int HEIGHT;

    public BacteriumSpace(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 20; ++i) {
                    Bacterium bacterium = BacteriumFactory.getBacterium(getRandomShape());
                    bacterium.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
                            getRandomHeight(), getRandomColor());
                }
            }
        });
    }

    public static void main(String[] args) {
        BacteriumSpace drawing = new BacteriumSpace(500, 600);
    }

    private BacteriumType getRandomShape() {
        return BACTERIUM_TYPES[(int) (Math.random() * BACTERIUM_TYPES.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }


}
