package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence .Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.AllAgrsConstructor;
import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.Getter;
@Entity
@Data
@AllAgrsConstructor
@NoArgsConstructor


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
    @Min(18)
    @Positive(message="Age should be in Postive number")
    @NotNull(message="Password is mandatory")
    private int age;

}