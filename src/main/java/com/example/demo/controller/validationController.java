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
import jakarta.validation.Valid;
import java.util.List;
@RestController
public class validationController{
    @Autowired validationService ser;  
    @PostMapping("/post2")
    public validationEntity sendData(@Valid @RequestBody validationEntity stu){
        return ser.postdata(stu);
    }

    
      @GetMapping("/putget2/{id}")
    public validationEntity putgetData(@PathVariable Long id){  
       return ser.putgetdata(id);
     }
    }
