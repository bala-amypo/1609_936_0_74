package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.validationEntity;
@Repository
public interface StudentRepository extends JpaRepository<validationEntity,Long>{
}