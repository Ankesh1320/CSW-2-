// Design a Java class called Rectangle with private attributes length and width. Include 
// a constructor to initialize these attributes, as well as setter and getter methods for each 
// attribute. Additionally, implement methods to calculate the area and perimeter of the 
// rectangle. Write a main method to create an object of the Rectangle class, set values 
// // for its attributes, and display the area and perimeter
class Rectangle {
private double length;
private double width;
public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
}

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double calculateArea() {
    double area=length*width;
        return area;
    }
    public double calculatePerimeter() {
        double perimeter=2*(length+width);
        return perimeter;
        }

}
public class Q2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println("Area of the rectangle is: " + rectangle.calculateArea());
        System.err.println("Perimeter of the rectangle is "+ rectangle.calculatePerimeter());
    }
    
}
