package meerkatDrawing;

import java.awt.Point;

interface LocatedRectangle {
    public int x();

    public int y();

    public int width();

    public int height();
    
    //public Point address();
    
    //public void draw();

    public default boolean intersects(LocatedRectangle other) {
        return !doesNotIntersect(other, 0);
    }

    public default boolean intersects(LocatedRectangle other, int margin) {
        return !doesNotIntersect(other, margin);
    }

    private boolean doesNotIntersect(LocatedRectangle other, int margin) {
        return leftOf(other, margin) || rightOf(other, margin) ||
                above(other, margin) || below(other, margin);
    }

    public default boolean leftOf(LocatedRectangle other, int margin) {
        return this.x() + this.width() + margin <= other.x();
    }

    public default boolean rightOf(LocatedRectangle other, int margin) {
        return this.x() >= other.x() + other.width() + margin;
    }

    private boolean above(LocatedRectangle other, int margin) {
        return this.y() + this.height() + margin <= other.y();
    }

    private boolean below(LocatedRectangle other, int margin) {
        return this.y() >= other.y() + other.height() + margin;
    }
}