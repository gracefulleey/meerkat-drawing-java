package meerkatDrawing;

import java.awt.*;

class Nose {
    private int width;
    private int height;

    public Nose(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(MeerkatDrawing.extremities);
        Drawing.pen().fillOval(x, y, width, height);

        Drawing.pen().setColor(Color.WHITE);
        Drawing.pen().fillOval(x + width / 2, y + height / 6, width / 4, height / 3);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}