package com.example.demo.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    @Qualifier("stagedData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id){
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDao.updateStudent(student);
    }

    public void addStudent(Student student) {
        this.studentDao.addStudent(student);
    }
}
