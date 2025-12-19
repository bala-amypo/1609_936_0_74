package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.JoinColum;
import jakarta.persistence.OneToOne;
// import lombok.Setter;
// import lombok.Getter;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
// @Setter
// @Getter
// @Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private int cardno;
    private String email;
    //private int student_id;
    @OneToOne
    @JoinColumn(name="student_id")
    private StudentId student;
   

}