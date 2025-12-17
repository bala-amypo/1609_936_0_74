package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
@Service
public class StudentServiceimpl implements StudentService{
   @Autowired StudentRepository student;//  acces the method in diff files
   //save();
   //findall();
   //findById();
   //deleteById();
   //existById();
   @Override

    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu);

    }




}