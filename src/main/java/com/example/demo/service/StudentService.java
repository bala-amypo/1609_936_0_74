package com.example.demo.service;
import com.example.demo.entity.StudentEntity;
import java.util.List;

public interface StudentService{
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity>getdata();
     StudentEntity String deletedata(int id);
}