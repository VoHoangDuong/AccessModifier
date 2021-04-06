public class Student {
    int Age;
    String name;

    public Student(int age, String name) {
        this.Age = age;
        this.name = name;
    }
    public void  display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + Age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(24, "Long");
        Student s2 = new Student(29, "Kiên");
        s1.display();
        s2.display();
    }
}
