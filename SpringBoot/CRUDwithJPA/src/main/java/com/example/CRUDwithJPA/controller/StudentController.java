package com.example.CRUDwithJPA.controller;

import com.example.CRUDwithJPA.model.Student;
import com.example.CRUDwithJPA.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;
    @GetMapping("/getstudents")
    public List<Student> getAllStudents(){
        return studentServices.getAllStudents();
    }
    @GetMapping("/getstudents/{rollNo}")
    public ResponseEntity<Student> getByStudentId(@PathVariable("rollNo") int rollNo) {
        Student s1 = studentServices.getByStudentId(rollNo);
        return s1 == null ? new ResponseEntity<>(null,HttpStatus.NOT_FOUND) : new ResponseEntity<>(s1,HttpStatus.OK);
    }
    @PostMapping("/addstudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        return studentServices.addStudent(student);
    }
    @PostMapping("/addlistofstudent")
    public String addStudent(@RequestBody List<Student> students){
        return studentServices.addAllStudents(students);
    }
    @PutMapping("/updatestudent")
    public String updateStudent(@RequestBody Student student){
        studentServices.addStudent(student);
        return "updated";
    }
    @DeleteMapping("/deletestudent/{rollNo}")
    public String deleteStudent(@PathVariable("rollNo") int rollNo){
        return studentServices.deleteStudent(rollNo);
    }
    @DeleteMapping("/deleteallstudents")
    public String deleteAllStudents(){
        return studentServices.deleteAllStudent();
    }
    @GetMapping("/findbydomain/{domain}")
    public List<Student> findByDomain(@PathVariable String domain){
        return studentServices.findByDomain(domain);
    }
    @GetMapping("/agegreater/{age}")
    public List<Student> findStudentByAgeGreaterThan(@PathVariable int age){
        return studentServices.findStudentAgeGreaterThan(age);
    }
    @GetMapping("students/filter")
    public List<Student> findStudentWithDomainAndAge(@Param("domain") String domain, @Param("age") int age){
        System.out.println(domain+" "+age);
        return studentServices.findByFilter(domain,age);
    }
}
