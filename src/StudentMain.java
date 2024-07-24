/*
##############################################################################
******************
Date july 23-2024
@Nilakantha
******************

2. Student Management System:
● Create a class Student with the following fields: studentId, name, age, and
grade.
● Include methods to set and get the values of these fields.
● Write a method to display the details of the student.
● In the Main class, create multiple Student objects, set their details, and display
them

######################################################################################
 */

import java.util.ArrayList;

class Student {
    private int studentId;
    private String name;
    private int age;

    private char grade;

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public Student(int studentId, String name, int age, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
public Student(){

}
    public void View(){
        System.out.print(name+" is a student with StudentId"+studentId+" age is "+age+" and his grade is "+grade);
}
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }


}

public class StudentMain{
    public static void main(String[] args) {

        Student a= new Student();
        a.setName("Chintu");
        a.setStudentId(123);
        a.setAge(24);
        a.setGrade('S');
        System.out.println(a);
        a.View();
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(123,"Nilakantha",27,'O'));
        students.add(new Student(124,"Pradhan",28,'O'));
        students.add(new Student());
        students.get(2).setName("virat");
for(Student st: students){
    System.out.println(st);

}
    }


}
