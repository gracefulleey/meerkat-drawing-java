package meerkatDrawing;

import meerkatDrawing.graphicState.*;

import java.util.ArrayList;

import static meerkatDrawing.MeerkatDrawing.count;
import static meerkatDrawing.MeerkatDrawing.size;

public class Scene {
    private ArrayList<Meerkat> meerkats = null; // aggregate
    private static State graphicState;
    private int width = 6;
    private int height = 15;

    public Scene() {
        meerkats = new ArrayList<>();
        graphicState = new NormalState();
    }

    public static void setGraphicState(State state) {
        graphicState = state;
    }

    public void generateMeerkats() {
        meerkats = new ArrayList<>();
        for (int n = 0; n < count; n++) {
            int x = RandomNumber.between(0, MeerkatDrawing.screenSizeWidth);
            int y = RandomNumber.between(0, MeerkatDrawing.screenSizeHeight);
            Meerkat meerkat = new Meerkat(width * size, height * size, x, y);
            addNewMeerkat(meerkat);
        }
    }

    public void addNewMeerkat(Meerkat newMeerkat) {
        boolean intersection = false;

        for (Meerkat meerkat : meerkats) {
            intersection = intersection || meerkat.intersects(newMeerkat);
        }
        if (!intersection) {
            meerkats.add(newMeerkat);
        }
    }


    public void draw() {
        graphicState.drawState();

        for (Meerkat meerkat : meerkats) {
            meerkat.drawAt();
        }
    }

    public void draw(int numOfMeerkats) {
        for (Meerkat meerkat : meerkats) {
            meerkat.drawAt();
            if (meerkat.equals(meerkats.get(numOfMeerkats))) {
                break;
            }
        }
    }
}
