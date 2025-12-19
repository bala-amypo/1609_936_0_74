package com.example.demo.service;
import com.example.demo.entity.validationEntity;
import java.util.List;

public interface validationService{
    validationEntity postdata(validationEntity stu);
    List<validationEntity>getdata();
    String deletedata(long id);
   validationEntity putgetdata(long id);
    validationEntity putupdatedata(long id,validationEntity std);
}