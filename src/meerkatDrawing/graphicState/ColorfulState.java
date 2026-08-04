package meerkatDrawing.graphicState;

import meerkatDrawing.MeerkatDrawing;
import meerkatDrawing.RandomNumber;

import java.awt.*;

public class ColorfulState extends State {
    public ColorfulState() {
    }

    @Override
    public void drawState() {
        MeerkatDrawing.front = new Color(RandomNumber.between(0, 255), RandomNumber.between(0, 255), RandomNumber.between(0, 255));
        MeerkatDrawing.extremities = new Color(RandomNumber.between(0, 255), RandomNumber.between(0, 255), RandomNumber.between(0, 255));
        MeerkatDrawing.fur = new Color(RandomNumber.between(0, 255), RandomNumber.between(0, 255), RandomNumber.between(0, 255));
    }
}
