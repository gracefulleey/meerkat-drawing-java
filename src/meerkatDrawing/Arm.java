package meerkatDrawing;

import java.awt.*;

class Arm {
    protected int width;
    protected int height;

    public Arm(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int x, int y) {
    }
}

class LeftArm extends Arm {
    public LeftArm(int width, int height) {
        super(width, height);
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(MeerkatDrawing.fur);
        int[] x1Points = {x - width / 2, x, x + width * 30 / 100, x - width / 2};
        int[] y1Points = {y - height / 17, y + height / 6, y + height / 2, y + height};
        int[] x2Points = {x + width * 30 / 100, x - width / 2, x - width, x - width / 2, x + width * 25 / 100};
        int[] y2Points = {y + height / 2, y + height / 2, y + height, y + height, y + height * 60 / 100};

        Drawing.pen().fillPolygon(x1Points, y1Points, 4);
        Drawing.pen().fillPolygon(x2Points, y2Points, 5);
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillPolygon(new int[]{x - width * 60 / 100, x - width * 65 / 100, x - width * 70 / 100},
                new int[]{y + height * 106 / 100, y + height * 111 / 100, y + height * 107 / 100}, 3);
        Drawing.pen().fillPolygon(new int[]{x - width * 75 / 100, x - width * 85 / 100, x - width * 85 / 100},
                new int[]{y + height * 107 / 100, y + height * 112 / 100, y + height * 107 / 100}, 3);
        Drawing.pen().fillPolygon(new int[]{x - width * 90 / 100, x - width, x - width},
                new int[]{y + height * 105 / 100, y + height * 110 / 100, y + height * 103 / 100}, 3);
        Drawing.pen().setColor(MeerkatDrawing.extremities);
        Drawing.pen().fillOval(x - width * 103 / 100, y + height * 94 / 100, width * 52 / 100, width * 55 / 100);
    }
}

class RightArm extends Arm {
    public RightArm(int width, int height) {
        super(width, height);
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(MeerkatDrawing.fur);
        int[] x1Points = {x + width / 2, x, x - width * 30 / 100, x + width / 2};
        int[] y1Points = {y - height / 17, y + height / 6, y + height / 2, y + height};
        int[] x2Points = {x - width * 30 / 100, x + width / 2, x + width, x + width / 2, x - width * 25 / 100};
        int[] y2Points = {y + height / 2, y + height / 2, y + height, y + height, y + height * 60 / 100};

        Drawing.pen().fillPolygon(x1Points, y1Points, 4);
        Drawing.pen().fillPolygon(x2Points, y2Points, 5);
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillPolygon(new int[]{x + width * 60 / 100, x + width * 65 / 100, x + width * 70 / 100},
                new int[]{y + height * 106 / 100, y + height * 111 / 100, y + height * 107 / 100}, 3);
        Drawing.pen().fillPolygon(new int[]{x + width * 75 / 100, x + width * 85 / 100, x + width * 85 / 100},
                new int[]{y + height * 107 / 100, y + height * 112 / 100, y + height * 107 / 100}, 3);
        Drawing.pen().fillPolygon(new int[]{x + width * 90 / 100, x + width, x + width},
                new int[]{y + height * 105 / 100, y + height * 110 / 100, y + height * 103 / 100}, 3);
        Drawing.pen().setColor(MeerkatDrawing.extremities);
        Drawing.pen().fillOval(x + width / 2, y + height * 94 / 100, width * 52 / 100, width * 55 / 100);
    }
}