package Task1;

/**
 * The Point class represents a point in a two-dimensional space.
 * It has two attributes: x and y.
 */
public class Point {

    // Attributes
    private int x;
    private int y;

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Calculate distance from origin
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Move the point
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Display point location
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    // Calculate distance between two points
    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Update point location
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Main method to test all methods
    public static void main(String[] args) {

        // Create first point
        Point p1 = new Point(5, 3);

        System.out.println("Initial Point: " + p1);
        System.out.println("X coordinate: " + p1.getX());
        System.out.println("Y coordinate: " + p1.getY());

        System.out.println("Distance from Origin: "
                + p1.distanceFromOrigin());

        // Test translate method
        p1.translate(2, 1);
        System.out.println("After Translation: " + p1);

        // Create second point
        Point p2 = new Point(2, 4);
        System.out.println("Second Point: " + p2);

        // Test distance method
        System.out.println("Distance between points: "
                + p1.distance(p2));

        // Test setLocation method
        p1.setLocation(10, 20);
        System.out.println("After setLocation: " + p1);

        // Test setters
        p1.setX(15);
        p1.setY(25);

        System.out.println("After using setters: " + p1);
    }
}