package DAO;

import Entity.Student;

import java.util.HashMap;

public interface StudentDAO {
    HashMap<String, Student> getAllStudent();

    void menu() throws ClassNotFoundException;

    void showInformationStudent();

    void add() throws ClassNotFoundException;

    void edit();

    void delete();

    void addAndEditPoint();

    void sortStudent();

    void getAllInformationStudent();

    String checkIdFormat();

    String checkNameFormat();

    String checkAgeFormat();

    String inputAddress();

    String checkGenderFormat();

    String checkPhoneNumberFormat();

    float inputPoint1();

    float inputPoint2();

    float inputPoint3();

    float inputPoint4();


    boolean checkIdStudent(String idStudent) throws ClassNotFoundException;



}
