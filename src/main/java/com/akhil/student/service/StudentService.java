package com.akhil.student.service;


import com.akhil.student.entity.Student;
import com.akhil.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Save a Student
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return  repository.findAll();
    }

    // Get student by ID
    public  Student getStudentByID(Integer id) {
        return repository.findById(id).orElse(null);
    }

    // Delete Student
    public  String deleteStudent(Integer id){
        repository.deleteById(id);
        return "Student with id" + id+"has been deleted.";
    }

    // Update Student
    public Student updateStudent(Integer id,Student studentDetails){

        //find if the student exists
        Student existingStudent=repository.findById(id).orElse(null);

        if(existingStudent !=null){
            // Upsate the feilds
            existingStudent.setName(studentDetails.getName());
            existingStudent.setBranch(studentDetails.getBranch());

            //save the updated version
            return repository.save(existingStudent);
        }
        return  null;
    }


}
