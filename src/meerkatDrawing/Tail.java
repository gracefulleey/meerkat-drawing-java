package meerkatDrawing;

class Tail {
    private int width;
    private int height;

    public Tail(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int x, int y) {
        int[] xPoints = {x + width * 20 / 100,
                x + width * 40 / 100,
                x + width * 73 / 100,
                x + width * 78 / 100,
                x + width * 77 / 100,
                x + width * 72 / 100,
                x + width * 45 / 100,
                x + width * 65 / 100,
                x + width * 63 / 100,
                x};
        int[] yPoints = {y,
                y + height * 15 / 100,
                y + height * 35 / 100,
                y + height * 45 / 100,
                y + height * 55 / 100,
                y + height * 65 / 100,
                y + height * 90 / 100,
                y + height * 60 / 100,
                y + height * 45 / 100,
                y + height * 10 / 100};

        Drawing.pen().setColor(MeerkatDrawing.fur);
        Drawing.pen().fillPolygon(xPoints, yPoints, 10);
        Drawing.pen().setColor(MeerkatDrawing.extremities);
        Drawing.pen().fillPolygon(new int[]{x + width * 72 / 100, x + width * 45 / 100, x + width * 65 / 100},
                new int[]{y + height * 65 / 100, y + height * 90 / 100, y + height * 60 / 100}, 3);
    }
}