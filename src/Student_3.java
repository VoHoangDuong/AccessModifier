import java.util.Scanner;

public class Student_3 {
  String name;
  int age;

    public Student_3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Student_3[] students = new Student_3[3];
        students[0] = new Student_3("Duong",18);
        students[1] = new Student_3("Dat",25);
        students[2] = new Student_3("Dung",21);
        for (int i = 0; i < 3; i++){
            students[i].display();
        }
    }
}
