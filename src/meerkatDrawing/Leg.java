package meerkatDrawing;

import java.awt.*;

class Leg {
    protected int width;
    protected int height;

    public Leg(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int x, int y) {
    }
}

class LeftLeg extends Leg {
    public LeftLeg(int width, int height) {
        super(width, height);
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(MeerkatDrawing.fur);
        int[] x1Points = {x - width * 140 / 100, x - width / 3, x + width * 20 / 100, x + width * 23 / 100, x + width * 20 / 100, x - width / 2, x - width * 70 / 100};
        int[] y1Points = {y, y - height / 2, y + height * 20 / 100, y + height * 25 / 100, y + height / 2, y + height, y + height * 60 / 100};
        int[] x2Points = {x + width * 20 / 100, x - width / 2, x - width * 70 / 100, x - width / 4};
        int[] y2Points = {y + height / 2, y + height / 2, y + height, y + height};
        int[] x3Points = {x - width * 70 / 100, x - width / 4, x + width / 4, x - width / 2};
        int[] y3Points = {y + height, y + height, y + height * 130 / 100, y + height * 130 / 100};

        Drawing.pen().fillPolygon(x1Points, y1Points, 7);
        Drawing.pen().fillPolygon(x2Points, y2Points, 4);
        Drawing.pen().fillPolygon(x3Points, y3Points, 4);
        Drawing.pen().setColor(MeerkatDrawing.extremities);
        Drawing.pen().fillOval(x - width / 2, y + height * 118 / 100, width * 75 / 100, width * 65 / 100);
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawLine(x + width * 10 / 100, y + height * 137 / 100, x, y + height * 130 / 100);
        Drawing.pen().drawLine(x - width * 10 / 100, y + height * 139 / 100, x - width * 20 / 100, y + height * 130 / 100);
    }
}

class RightLeg extends Leg {
    public RightLeg(int width, int height) {
        super(width, height);
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(MeerkatDrawing.fur);
        int[] x1Points = {x + width * 140 / 100, x + width / 3, x - width * 20 / 100, x - width * 23 / 100, x - width * 20 / 100, x + width / 2, x + width * 70 / 100};
        int[] y1Points = {y, y - height / 2, y + height * 20 / 100, y + height * 25 / 100, y + height / 2, y + height, y + height * 60 / 100};
        int[] x2Points = {x - width * 20 / 100, x + width / 2, x + width * 70 / 100, x + width / 4};
        int[] y2Points = {y + height / 2, y + height / 2, y + height, y + height};
        int[] x3Points = {x + width * 70 / 100, x + width / 4, x - width / 4, x + width / 2};
        int[] y3Points = {y + height, y + height, y + height * 130 / 100, y + height * 130 / 100};

        Drawing.pen().fillPolygon(x1Points, y1Points, 7);
        Drawing.pen().fillPolygon(x2Points, y2Points, 4);
        Drawing.pen().fillPolygon(x3Points, y3Points, 4);
        Drawing.pen().setColor(MeerkatDrawing.extremities);
        Drawing.pen().fillOval(x - width * 23 / 100, y + height * 118 / 100, width * 75 / 100, width * 65 / 100);
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawLine(x - width * 10 / 100, y + height * 137 / 100, x, y + height * 130 / 100);
        Drawing.pen().drawLine(x + width * 10 / 100, y + height * 139 / 100, x + width * 20 / 100, y + height * 130 / 100);
    }
}