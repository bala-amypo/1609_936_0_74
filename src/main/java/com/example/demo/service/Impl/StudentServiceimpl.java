package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentEntity;
@Service
public class StudentServiceimpl implements StudentService{
   @Autowired StudentRepository student;//  acces the method in diff files
   //save();
   //findall();
   //findById();
   //deleteById();
   //existById();

    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu);
        
    }




}