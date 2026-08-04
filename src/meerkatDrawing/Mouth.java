package meerkatDrawing;

import java.awt.*;

class Mouth {
    private int width;
    private int height;

    public Mouth(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int xP, int yP, int nP) {
        int[] xPoints = {xP, xP + width * 5 / 100, xP + width / 4, xP + width * 45 / 100, xP + width / 2, xP + width * 55 / 100, xP + width * 75 / 100, xP + width * 95 / 100, xP + width};
        int[] yPoints = {yP, yP + height / 2, yP + height, yP + height / 2, yP, yP + height / 2, yP + height, yP + height / 2, yP};

        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawPolyline(xPoints, yPoints, nP);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
