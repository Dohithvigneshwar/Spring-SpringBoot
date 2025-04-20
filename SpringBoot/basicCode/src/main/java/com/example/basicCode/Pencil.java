package com.example.basicCode;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Pencil implements Stationery{
    public void details(){
        System.out.println("Student using pencil to write the exam");
    }
}
