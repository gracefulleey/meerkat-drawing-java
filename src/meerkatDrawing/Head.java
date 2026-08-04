package meerkatDrawing;

class Head {
    private int width;
    private int height;

    private Ear leftEar;    //composite
    private Ear rightEar;   //composite
    private Eye leftEye;    //composite
    private Eye rightEye;   //composite
    private Nose nose;      //composite
    private Mouth mouth;    //composite

    public Head(int width, int height) {
        this.width = width / 2;
        this.height = height / 5;

        leftEar = new Ear(this.width * 25 / 100, this.height * 40 / 100);
        rightEar = new Ear(this.width * 25 / 100, this.height * 40 / 100);
        leftEye = new Eye(this.width * 17 / 100, this.height * 17 / 100);
        rightEye = new Eye(this.width * 17 / 100, this.height * 17 / 100);
        nose = new Nose(this.width * 15 / 100, this.height * 10 / 100);
        mouth = new Mouth(this.width * 25 / 100, this.height * 3 / 100);
    }

    public void drawAt(int x, int y) {
        leftEar.drawAt(x + width - leftEar.getWidth(), y + height / 8);
        rightEar.drawAt(x, y + height / 8);

        Drawing.pen().setColor(MeerkatDrawing.fur);
        Drawing.pen().fillOval(x + width / 8, y, width * 75 / 100, height * 75 / 100);
        Drawing.pen().setColor(MeerkatDrawing.front);
        Drawing.pen().fillArc(x + width / 8, y, width * 75 / 100, height * 75 / 100, 180, 180);
        Drawing.pen().fillArc(x + width / 8, y + height / 6, width * 75 / 100 / 2, height * 75 / 100 / 2, 180, 360);
        Drawing.pen().fillArc(x + width / 2, y + height / 6, width * 75 / 100 / 2, height * 75 / 100 / 2, 180, 360);

        leftEye.drawAt(x + width / 2 + width / 8, y + height / 4);
        rightEye.drawAt(x + width / 2 - rightEye.getWidth() - width / 8, y + height / 4);
        nose.drawAt(x + width / 2 - nose.getWidth() / 2, y + height * 40 / 100);
        mouth.drawAt(x + width / 2 - mouth.getWidth() / 2, y + height * 55 / 100, 9);
    }
}