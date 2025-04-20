package com.example.basicCode;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Data
@Component
//@Scope("singleton")
//@Scope("prototype")
public class Student {
//    int age;
//    Field Injection
//    @Autowired
//    @Qualifier("pen")
    private Stationery stationery;
//    public Student(){
//        System.out.println("Student class Constructor");
//    }
//    Constructor Injection
//    @Autowired
//    public Student(@Qualifier("pencil") Stationery stationery){
//        this.stationery = stationery;
//    }
//  Setter Injection
    @Autowired
    @Qualifier("pencil")
    public void setPen(Stationery stationery){
        this.stationery = stationery;
    }
    public void getStudentStationery(){
        stationery.details();
    }
}
