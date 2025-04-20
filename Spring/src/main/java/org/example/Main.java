package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Student student1 = (Student) container.getBean("student");


//        Faculty faculty1 = (Faculty) container.getBean(Faculty.class);
//        student1.details("dohith");
//        System.out.println("Student Age : "+student1.getAge());
//        System.out.println("Student Roll No : "+student1.getRollNo());

        student1.getStudentStationery();

    }
}