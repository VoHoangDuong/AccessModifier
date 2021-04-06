public class TestCircle {
    public static void main(String[] args) {
        Circle cr = new Circle(5, "blue");
        System.out.println("Radius : " + cr.getRadius());
        System.out.printf("Area : " + "%-10.2f\n",cr.getArea());
    }
}
