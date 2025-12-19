package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.validationService;
import com.example.demo.repository.validationRepository;
import com.example.demo.entity.Entity;
import com.example.demo.exception.TimeStampException;
import java.util.List;
@Service
public class TimeStampServiceimpl implements TimeStampService{
   @Autowired TimeStampRepository tp;//  acces the method in diff files
   //save();
   //findall();
   //findById();
   //deleteById();
   //existById();
   @Override
    public TimeStampEntity postdata(TimeStamoEntity stu){
        return tp.save(stu);
    }
    }
   