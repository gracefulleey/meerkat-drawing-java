package meerkatDrawing;

abstract class SouthernAfricanAnimal {
    private int width;
    private int height;

    public SouthernAfricanAnimal(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void speak() {
        System.out.println("The animal speaks");
    }
}
