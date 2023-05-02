public class Shape {
    private double perimeter;
    private double area;

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePerimeter() {
        return this.perimeter;
    }

    public double calculateArea() {
        return this.area;
    }
}

class Rectangle extends Shape {
    private double heigth;
    private double width;

    public Rectangle(double heigth, double width) {
        this.heigth = heigth;
        this.width = width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}
