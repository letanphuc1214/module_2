package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args){
        Student.change();
        Student s1 = new Student(0, "Phuc");
        Student s2 = new Student(1, "Tin");
        Student s3 = new Student(2,"Long");
        Student s4 = new Student(3,"Nguyen");
        Student s5 = new Student(4,"Hiep");
        Student s6 = new Student(5,"Huong");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}
