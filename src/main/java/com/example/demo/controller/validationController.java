package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.validationService;
import com.example.demo.entity.validationEntity;
import java.util.List;
@RestController
public class validationController{
    @Autowired validationService serv;  
    @PostMapping("/post")
    public validationEntity sendData(@RequestBody validationEntity val){
        return ser.postdata(val);//to ser calling the service layer
    }
    @GetMapping("/get")
    public List<validationEntity> getData(){
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
    public StudentEntity putupdateData(@PathVariable int id,@RequestBody StudentEntity std){
        return ser.putupdatedata(id,std);
    }
}