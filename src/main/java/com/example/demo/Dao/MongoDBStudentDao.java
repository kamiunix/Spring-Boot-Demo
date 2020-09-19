package com.example.demo.Dao;

import com.example.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoDBStudentDao implements StudentDao {

    Connection mongoConnection;

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            add(new Student(1, ""))
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void addStudent(Student student) {

    }
}
