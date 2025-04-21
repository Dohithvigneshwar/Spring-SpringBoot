package com.example.basicCRUDoperation.service;

import com.example.basicCRUDoperation.model.Student;
import org.springframework.stereotype.Service;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CRUDService {
    List<Student> list = new ArrayList<>(
            Arrays.asList(
                new Student(1,"Dohith","SpringBoot"),
                new Student(2,"Prasanna","Machine Learning")
            )
    );
    public List<Student> getStudentsDetails() {
        return list;
    }

    public Student getStudentsDetailsByRollNo(int rollNo) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getRollNo() == rollNo) return list.get(i);
        }
        return null;
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public String updateStudent(Student student) {
        for(int i=0;i<list.size();i++){
            if(student.getRollNo() == list.get(i).getRollNo()){
                list.set(i,student);
                return "Updated student details";
            }
        }
        return "match not found";
    }

    public String deleteStudent(int rollno) {
        for(int i=0;i<list.size();i++){
            if(rollno == list.get(i).getRollNo()){
                list.remove(i);
                return "student deleted";
            }
        }
        return "Match not Found";
    }
}
