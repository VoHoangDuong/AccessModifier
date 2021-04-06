public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public StaticMethod(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "Codegym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod stdudent = new StaticMethod(11, "Vo Hoang Duong");
        stdudent.display();
        StaticMethod student1 = new StaticMethod(23, "Nguyen Duy Han");
        student1.display();
        StaticMethod student2 = new StaticMethod(33, "Pham Dang Phong");
        student2.display();
    }
}
