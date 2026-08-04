package meerkatDrawing;

class Ear {
    private int width;
    private int height;

    public Ear(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(MeerkatDrawing.extremities);
        Drawing.pen().fillOval(x, y, width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}