package pgdp.rectangles;

public class Rectangle {
    private Vector2D topLeft;
    private Vector2D bottomRight;

    public Rectangle(Vector2D topLeft, Vector2D bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle() {
    }

    public Vector2D getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Vector2D topLeft) {
        this.topLeft = topLeft;
    }

    public Vector2D getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Vector2D bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Rectangle spanned by points " + getTopLeft() + " and " + getBottomRight() + ".";
    }

    public double calculateArea() {
        double result;
        double delta_x = Math.abs(topLeft.getX() - bottomRight.getX());
        double delta_y = Math.abs(topLeft.getY() - bottomRight.getY());
        result = delta_x * delta_y;
        return result;
    }

    public void shiftBy(Vector2D shift) {
        // [1.0, 2.0]" und "[3.0, 1.0]" -> "[2.5, 1.5]"
        topLeft.add(shift);
        bottomRight.add(shift);
    }


}
