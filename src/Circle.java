public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double radius(){
    return this.radius*this.radius*Math.PI;
    }
    public double getCircumference(){
        return this.radius*2*Math.PI;
    }
}
