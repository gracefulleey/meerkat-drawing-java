package meerkatDrawing.graphicState;

import meerkatDrawing.MeerkatDrawing;

import java.awt.*;

public class NormalState extends State {
    public NormalState() {
    }

    @Override
    public void drawState() {
        MeerkatDrawing.front = Color.decode("#DEBE85");
        MeerkatDrawing.extremities = Color.decode("#5c3622");
        MeerkatDrawing.fur = Color.decode("#C55D26");
    }
}
