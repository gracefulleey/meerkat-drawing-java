package meerkatDrawing;

class Body {
    private int width;
    private int height;
    private Arm leftArm;        //composite
    private Arm rightArm;       //composite
    private Leg leftLeg;        //composite
    private Leg rightLeg;       //composite
    private Tail tail;          //composite
    private Belly belly;        //composite

    public Body(int width, int height) {
        this.width = width / 2;
        this.height = height;

        leftArm = new LeftArm(this.width / 4, this.height * 20 / 100);
        rightArm = new RightArm(this.width / 4, this.height * 20 / 100);
        leftLeg = new LeftLeg(this.width / 3, this.height * 20 / 100);
        rightLeg = new RightLeg(this.width / 3, this.height * 20 / 100);
        tail = new Tail(this.width, this.height * 30 / 100);
        belly = new Belly(this.width * 60 / 100, this.height * 40 / 100);
    }

    public void drawAt(int x, int y) {
        tail.drawAt(x + width / 2, y + height * 30 / 100);
        leftLeg.drawAt(x + width / 2 + belly.getWidth() / 2, y + height * 30 / 100);
        rightLeg.drawAt(x + width / 2 - belly.getWidth() / 2, y + height * 30 / 100);
        belly.drawAt(x + width / 2 - belly.getWidth() / 2, y);
        rightArm.drawAt(x + width / 2 - belly.getWidth() / 2, y + rightArm.height / 4);
        leftArm.drawAt(x + width / 2 + belly.getWidth() / 2, y + rightArm.height / 4);
    }
}