package com.example.CRUDwithJPA.repository;

import com.example.CRUDwithJPA.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByDomain(String domain);
    List<Student> findByAgeGreaterThan(int age);
    List<Student> findByNameContaining(String name);
    @Query(nativeQuery = true,value = "select * from student```` where domain = :domain and age = :age")
    List<Student> findByAgeAndDomain(
            @Param("domain") String domain,
            @Param("age") int age
    );

//    findByName(String name)	Finds students with exact name

//    findByAgeGreaterThan(int age)	Finds students older than a certain age

//    findByAgeLessThan(int age)	Finds students younger than a certain age

//    findByAgeBetween(int min, int max)	Finds students between ages

//    findByNameContaining(String keyword)	Name like %keyword%

//    findByNameStartingWith(String prefix)	Name starts with a prefix

//    findByNameEndingWith(String suffix)	Name ends with a suffix

//    findByDomainIgnoreCase(String domain)	Case-insensitive domain match

//    findByAgeOrderByNameAsc(int age)	Find and sort by name ASC

//    findTop3ByOrderByAgeDesc()	Top 3 oldest students

//    existsByRollNo(int rollNo)	Returns true if roll number exists

//    countByDomain(String domain)	Count students by domain

//    deleteByName(String name)	Deletes all with matching name

}
