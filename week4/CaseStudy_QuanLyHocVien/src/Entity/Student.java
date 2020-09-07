package Entity;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student>{
    public String idStudent;
    private String studentName;
    private String age;
    private String address;
    private String gender;
    private String phoneNumber;
    private float point1;
    private float point2;
    private float point3;
    private float point4;
    private float average;

    public Student() {
    }

    public Student(String idStudent, String studentName, String age, String address, String gender, String phoneNumber) {
        this.idStudent = idStudent;
        this.studentName = studentName;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public Student(float point1, float point2, float point3, float point4) {
    }


    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getPoint1() {
        return point1;
    }

    public void setPoint1(float point1) {
        this.point1 = point1;
    }

    public float getPoint2() {
        return point2;
    }

    public void setPoint2(float point2) {
        this.point2 = point2;
    }

    public float getPoint3() {
        return point3;
    }

    public void setPoint3(float point3) {
        this.point3 = point3;
    }

    public float getPoint4() {
        return point4;
    }

    public void setPoint4(float point4) {
        this.point4 = point4;
    }

    public float getAverage() {
        float avg = ((point1 + point2) + (point3 * 2) + (point4 * 3)) / (2 + (1 * 2) + (1 * 3));
        return avg;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + idStudent +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return Float.compare(student.getAverage(), this.getAverage());
    }
}
