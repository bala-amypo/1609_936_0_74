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
    @PostMapping("/post2")
    public validationEntity sendData(@RequestBody validationEntity val){
        return serv.postdata(val);//to ser calling the service layer
    }
    @GetMapping("/get1")
    public List<validationEntity> getData(){
        return serv.getdata();
    }
    @DeleteMapping("/del/{id}2")
    public String DeleteData(@PathVariable int id){
        return serv.deletedata(id);
    }
    @GetMapping("/putget/{id}2")
    public validationEntity putgetData(@PathVariable int id){  
        return serv.putgetdata(id);
    }
    @PutMapping("/putupdate/{id}2")
    public validationEntity putupdateData(@PathVariable int id,@RequestBody validationEntity vali){
        return serv.putupdatedata(id,vali);
    }
}