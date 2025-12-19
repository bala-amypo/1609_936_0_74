package com.example.demo.service;

import com.example.demo.entity.TimeStampEntity;

public interface TimeStampService {

    TimeStampEntity postData(TimeStampEntity stu);

    TimeStampEntity getById(long id);
}
