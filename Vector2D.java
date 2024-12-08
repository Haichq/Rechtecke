package pgdp.rectangles;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D() {
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public void add(Vector2D vector2D) {
        setX(getX() + vector2D.getX());
        setY(getY() + vector2D.getY());
    }

    @Override
    public String toString() {
        return "[" + getX() + ", " + getY() + "]";

    }

}
