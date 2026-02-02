package com.akhil.student.controller;

import com.akhil.student.entity.Student;
import com.akhil.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
       return service.saveStudent(student);

    }

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return service.getAllStudents();

    }

    @GetMapping("{id}")
    public Student getStudentByID(@PathVariable Integer id){
        return  service.getStudentByID(id);

    }
    @PutMapping("/update/{id}")
    public Student UpdateStudent(@PathVariable Integer id,@RequestBody Student student){
        return service.updateStudent(id,student);
    }

    @DeleteMapping("/delete/{id}")
    public String DeleteStudent(@PathVariable Integer id){
        return service.deleteStudent(id);

    }

    @GetMapping("search")
    public List<Student> searchStudent(@RequestParam String name){
        return service.searchByName(name);
    }

}
