package com.tom.week02.day04;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToCenter {
  public static void drawImage(Graphics graphics) {
    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a line from that point to the center of the canvas
    // Fill the canvas with lines from the edges (every 20 px) to the center

    for (int i = 0; i <= (WIDTH / 20); i++) {
      for (int j = 0; j <= (HEIGHT / 20); j++) {
        if (i == 0 || i == (WIDTH / 20) || j == 0 || j == (HEIGHT / 20)) {
          drawLine(i * 20, j * 20, graphics);
        }
      }
    }
  }

  private static void drawLine(int x, int y, Graphics g) {
    g.setColor(new Color((int) (Math.random() * 0x1000000)));
    g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);
    }
  }
}