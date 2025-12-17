package com.example.demo.entity;
import 
@Entity
public class StudentEntity{
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date dob;
    private Date createdAt;
    public void setId(Integer id){
        this.id=id;
    }
    public void setusername(String username){
        this.username=username;
    }
    public void setemail(String email){
        this.email=email;
    }
     public void setpassword(String password){
        this.password=password;
    }
    public void setcreatedAt(String createdAt){
        this.password=password;
    }



}