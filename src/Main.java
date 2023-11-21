// test
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//prompting user to select the shape
        System.out.println("Select the Shape: 1-Circle, 2-Rectangle, 3-Square");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        //based on the selection create circle, square and rectangle objects and pass the parameters
        switch (choice) {
            case "1":
                calculateCircleArea();
                break;

            case "2":
                calculateRectangleArea();
                break;

            case "3":
                calculateSquarArea();
                break;

            default:
                System.out.println("no match");
        }

    }

    public static void calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle(radius);

        System.out.println("Area of Circle: " + circle1.calculateArea() + "\nPerimeter of Circle: " + circle1.perimeterCalculate());
    }
    public static void calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the Rectangle:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("\nShape: Rectangle " + "\nArea of Rectangle: " + rectangle.calculateArea() + "\nPerimeter of Rectangle: " + rectangle.perimeterCalculate());
    }
    public static void calculateSquarArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side Value of the Square:");
        double length = scanner.nextDouble();
        Square square1 = new Square(length);
        System.out.println("\nArea of Square: " + square1.calculateArea() + "\nPerimeter of Square: " + square1.perimeterCalculate());
    }
}

