package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllAgrsConstructor;
import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.Getter;
@Entity
@Data
@AllAgrsConstructor
@NoArgsConstructor
// @Setter
// @Getter
// @Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date createdAt;

}