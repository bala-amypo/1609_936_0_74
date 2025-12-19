package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStampEntity;

import jakarta.validation.Valid;

@RestController
public class TimeStampController {

    @Autowired
    private TimeStampService ser;

    @PostMapping("/post3")
    public TimeStampEntity sendData(@Valid @RequestBody TimeStampEntity stu) {
        return ser.postData(stu);
    }

    @GetMapping("/get/{id}")
    public TimeStampEntity getById(@PathVariable long id) {
        return ser.getById(id);
    }
}
