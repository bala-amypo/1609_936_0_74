package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Postive;
@Entity
public class validationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=6,message="Must be 2 to 6 characters")
    private String username;
    @Email(message="email is not valid")
    private String email;
    @Size(min=2,max=10)
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Postive(message="Age should be in Postive number")
    @NotNull(message="Password is mandatory")
    private int age;
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
        this.age=age;
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
   
    public int Age(){
        return age;
    }
    public StudentEntity(Long id,@NotNull
    @Size(min=2,max=6,message="Must be 2 to 6 characters") String username,
    @Email(message="email is not valid")String email,@Size(min=2,max=10)
    @NotNull(message="Password is mandatory") String password,
    @Max(30)
    @Postive(message="Age should be in Postive number")
    @NotNull(message="Password is mandatory") int age){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
    }
    public StudentEntity(){

    }



}
    
}