package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.validationService;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import java.util.List;
@Service
public class validationServiceimpl implements validationService{
   @Autowired validationRepository student;//  acces the method in diff files
   //save();
   //findall();
   //findById();
   //deleteById();
   //existById();
   @Override
    public validationEntity postdata(validationEntity val){
        return student.save(stu);
    }
    @Override
    public List<validationEntity>getdata(){
        return student.findAll();
    }
    @Override
    public String deletedata(int id){
        student.deleteById(id);
        return "deleted successfully";
    }
    @Override
    public validationEntity putgetdata(int id){
       return student.findById(id).orElse(null);
    
    }
    @Override
    public validationEntity putupdatedata(int id,validationEntity std){
        if(student.existsById(id)){//checking where it isprsent or not in spfici row
            std.setId(id);//settting the value to that roe
            return student.save(std);//return the value
        }
        return null;
    }
   

}