package meerkatDrawing;

class Meerkat extends SouthernAfricanAnimal implements LocatedRectangle {
    private int width;
    private int height;
    private int x;
    private int y;

    private Head head;            //aggregate
    private Body body;            //aggregate


    public Meerkat(int width, int height, int x, int y) {
        super(width, height);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;

        head = new Head(width, height);
        body = new Body(width, height);
    }

    public void drawAt() {
        body.drawAt(x, y + height / 8);
        head.drawAt(x, y);
    }


    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    @Override
    public int width() {
        return width;
    }

    @Override
    public int height() {
        return height;
    }

}