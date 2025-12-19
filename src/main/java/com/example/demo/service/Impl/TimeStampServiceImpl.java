package com.example.demo.service.Impl;

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
    public TimeStampEntity postData2(TimeStampEntity stu) {
        return tp.save(stu);
    }
}
