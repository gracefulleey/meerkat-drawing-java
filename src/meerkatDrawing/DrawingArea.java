package meerkatDrawing;

import javax.swing.*;
import java.awt.Graphics;

@SuppressWarnings("serial")
class DrawingArea extends JPanel {
    private Scene scene;

    public DrawingArea() {
        scene = new Scene();
        setBackground(MeerkatDrawing.backgroundColor);
        scene.generateMeerkats();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Drawing.set(g);
        scene.draw();
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}