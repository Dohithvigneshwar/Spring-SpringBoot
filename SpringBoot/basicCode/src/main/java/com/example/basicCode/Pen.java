package com.example.basicCode;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Stationery{
    public void details(){
        System.out.println("Student using pen to write the exam");
    }
}
