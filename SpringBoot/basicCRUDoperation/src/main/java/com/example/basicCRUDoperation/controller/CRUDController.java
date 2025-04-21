package com.example.basicCRUDoperation.controller;

import com.example.basicCRUDoperation.model.Student;
import com.example.basicCRUDoperation.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CRUDController {
    @Autowired
    CRUDService crudService;
    @GetMapping("getstudents")
    public List<Student> getStudents(){
        return crudService.getStudentsDetails();
    }
    @GetMapping("getstudents/{rollNo}")
    public Student getStudentByRollNo(@PathVariable("rollNo") int rollNo){
        return crudService.getStudentsDetailsByRollNo(rollNo);
    }
    @PostMapping("addstudent")
    public String addStudent(@RequestBody Student student){
        crudService.addStudent(student);
        return "student addded";
    }
    @PutMapping("updatestudent")
    public String updateStudent(@RequestBody Student student){
        return crudService.updateStudent(student);
    }
    @DeleteMapping("deletestudent/{rollno}")
    public String deleteStudent(@PathVariable("rollno") int rollno){
        return crudService.deleteStudent(rollno);
    }
}
