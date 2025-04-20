package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Student {
    private int age;
    private int rollNo;
    @Autowired
    private Stationery stationery;
    public Student(){
//        System.out.println("Student object Created");
    }

    public Student(int age, int rollNo, Stationery stationery) {
        this.age = age;
        this.rollNo = rollNo;
        this.stationery = stationery;
    }

    public void details(String name){
        System.out.println(name);
    }
    public void setStationery(Stationery stationery){
        this.stationery = stationery;
    }
    public void setAge(int age){
//        System.out.println("age Setter is called by spring framework");
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setRollNo(int rollNo){
//        System.out.println("roll no Setter is called by spring framework");
        this.rollNo = rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void getStudentStationery() {
        stationery.getDetails();
    }
}
