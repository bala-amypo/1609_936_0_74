package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import java.util.List;
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
    @Override
    public List<StudentEntity>getdata(){
        return student.findAll();
    }
    @Override
    public String deletedata(int id){
        student.deleteById(id);
        return "deleted successfully";
    }
    @Override
    public StudentEntity putgetdata(int id){
       return student.findById(id).orElse(null);
    
    }
    @Override
    public StudentEntity putupdatedata(int id,StudentEntity stu){
        if(student.existsById(id)){//checking where it isprsent or not in spfici row
            stu.setId(id);//settting the value to that roe
            return student.save(stu);//return the value
        }
        return null;
    }
   

}