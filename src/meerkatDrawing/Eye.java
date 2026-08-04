package meerkatDrawing;

import java.awt.*;

class Eye {
    private int width;
    private int height;

    public Eye(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillOval(x, y, width, height);

        Drawing.pen().setColor(Color.WHITE);
        Drawing.pen().fillOval(x + width / 3, y + height / 6, width / 3, height / 3);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
