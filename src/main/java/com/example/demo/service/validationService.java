package com.example.demo.service;
import com.example.demo.entity.validationEntity;
import java.util.List;

public interface validationService{
    validationEntity postdata(validationEntity stu);
    List<validationEntity>getdata();
    String deletedata(int id);
   validationEntity putgetdata(int id);
    validationEntity putupdatedata(int id,validationEntity std);
}