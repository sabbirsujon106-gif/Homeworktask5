package Task2;

import Task1.Point;

/**
 * Represents a line between two points.
 */
public class Line {

    private Point p1;
    private Point p2;

    /**
     * Default constructor.
     */
    public Line() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
    }

    /**
     * Parameterized constructor.
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Returns the starting point.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Sets the starting point.
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Returns the ending point.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Sets the ending point.
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Displays the line.
     */
    @Override
    public String toString() {
        return "Line [Starting Point: " + p1
                + ", Ending Point: " + p2 + "]";
    }

    /**
     * Calculates the length of the line.
     */
    public double getLength() {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
}