package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.service.TimeStampService;

import java.time.LocalDateTime;

@Service
public class TimeStampServiceImpl implements TimeStampService {

    @Autowired
    private TimeStampRepository tp;

    @Override
    public TimeStampEntity postData(TimeStampEntity stu) {
        stu.setCreatedAt(LocalDateTime.now());
        stu.setUpdatedAt(LocalDateTime.now());
        return tp.save(stu);
    }

    @Override
    public TimeStampEntity getById(long id) {
        return tp.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));
    }
}
