class Point{
    private int x;
    private int y;

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    // Getter method for X
    public int getX() {
        return x;
    }

    // Setter method for X
    public void setX(int x) {
        this.x = x;
    }

    // Getter method for Y
    public int getY() {
        return y;
    }

    // Setter method for Y
    public void setY(int y) {
        this.y = y;
    }

    // toString method to print point coordinates
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
    public class Q3 {
    public static void main(String[] args) {
        // Create a new point object
        Point point1 = new Point(10, 20);
        System.out.println("Point 1: " + point1);

        // Create a copy of point1 using the copy constructor
        Point point2 = new Point(point1);
        System.out.println("Point 2 (copy of Point 1): " + point2);

        // Modify point1's coordinates
        point1.setX(30);
        point1.setY(40);
        System.out.println("Point 1 after modification: " + point1);

        // Verify that point2 remains unchanged
        System.out.println("Point 2 after modifying Point 1: " + point2);

        // Modify point2's coordinates
        point2.setX(50);
        point2.setY(60);
        System.out.println("Point 2 after modification: " + point2);

        // Verify that point1 remains unchanged
        System.out.println("Point 1 after modifying Point 2: " + point1);
    }
}