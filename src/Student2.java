    class Student2 {
    String name;
    int age;
    String gender;
    double gpa;

    public Student2(String name, int age, String gender, double gpa) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("GPA : " + gpa);
    }

    public static void main(String[] args) {
        Student2 std = new Student2("Duong",20,"Female",60);
        std.display();

    }
}
