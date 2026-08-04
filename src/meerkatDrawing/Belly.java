package meerkatDrawing;

class Belly {
    private int width;
    private int height;

    public Belly(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawAt(int x, int y) {
        Drawing.pen().setColor(MeerkatDrawing.fur);
        Drawing.pen().fillOval(x, y, width, height);
        Drawing.pen().setColor(MeerkatDrawing.front);
        Drawing.pen().fillOval(x + width / 6, y + height / 8, width * 65 / 100, height * 75 / 100);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
