package com.example.CRUDwithJPA.services;
import com.example.CRUDwithJPA.model.Student;
import com.example.CRUDwithJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getByStudentId(int rollNo) {
        return studentRepository.findById(rollNo).orElse(null);
    }
    public ResponseEntity<String> addStudent(Student student) {
        studentRepository.save(student);
        return new ResponseEntity<>("student added", HttpStatus.OK);
    }
    public String addAllStudents(List<Student> students) {
        studentRepository.saveAll(students);
        return "students added";
    }
    public String deleteStudent(int rollNo) {
        studentRepository.deleteById(rollNo);
        return "record deleted";
    }
    public String deleteAllStudent(){
        studentRepository.deleteAll();
        return "all record are deleted";
    }

    public List<Student> findStudentAgeGreaterThan(int age) {
        return studentRepository.findByAgeGreaterThan(age);
    }

    public List<Student> findByDomain(String domain) {
        return studentRepository.findByDomain(domain);
    }
    public List<Student> findByFilter(String domain, int age) {
        return studentRepository.findByAgeAndDomain(domain,age);
    }
}
