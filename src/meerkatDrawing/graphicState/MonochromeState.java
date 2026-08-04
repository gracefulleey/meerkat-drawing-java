package meerkatDrawing.graphicState;

import meerkatDrawing.MeerkatDrawing;

import java.awt.*;

public class MonochromeState extends State {
    public MonochromeState() {
    }

    @Override
    public void drawState() {
        MeerkatDrawing.front = new Color(192, 192, 192);
        MeerkatDrawing.extremities = Color.BLACK;
        MeerkatDrawing.fur = Color.WHITE;
    }
}
