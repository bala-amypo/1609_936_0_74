package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import java.util.List;
@RestController
public class StudentController{
    @Autowired StudentService ser;  
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postdata(stu);//to ser calling the service layer
    }
    @GetMapping("/get")
    public List<StudentEntity> getData(){
        return ser.getdata();
    }
    @DeleteMapping("/del/{id}")
    public String DeleteData(@PathVariable int id){
        return ser.deletedata(id);
    }
    @GetMapping("/putget/{id}")
    public StudentEntity putgetData(@PathVariable int id){
        return ser.putgetdata(id);
    }
    @PutMapping("/putupdate/{id}")
    public String putupdateData(@PathVariable int id,@RequestBody StudentEntity stu){
        return ser.putupdatedata(id,stu);
    }




}