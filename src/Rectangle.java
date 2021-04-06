import java.util.Scanner;
public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle{ " + " width : " + width + " height : " + height  + " } ";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        rectangle.display();
        System.out.println("Area : " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
    }
}
