public class Circle {
  public double radius;
  public String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return this.radius*this.radius*3.14;
    }
}
