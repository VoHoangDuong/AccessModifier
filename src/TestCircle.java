public class TestCircle {
    public static void main(String[] args) {
        Circle cr = new Circle(5);
        System.out.printf("Area : " + "%-10.2f\n",cr.radius());
        System.out.printf("Circumference : " + "%-10.2f\n",cr.getCircumference());
    }
}
