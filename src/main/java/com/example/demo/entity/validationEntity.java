package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class validationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=6,message="Must be 2 to 6 characters")
    private String username;
    private String email;
    private String password;
    private Interger age;
    public void setId(Long id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
     public void setPassword(String password){
        this.password=password;
    }
    public void setAge(Integer Age){
        this.createdAt=createdAt;
    }
    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
   
    public Age Age(){
        return createdAt;
    }
    public StudentEntity(Integer id,String username,String email,String password,Interger Age){
        this.username=username;
        this.email=email;
        this.password=password;
        this.createdAt=createdAt;
    }
    public StudentEntity(){

    }



}
    
}