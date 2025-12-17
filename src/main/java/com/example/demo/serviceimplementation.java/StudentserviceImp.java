package com.example.demo.serviceimplementation;

import org.springframework.stereotype.service;

import com.example.demo.entity.stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.Studentservice;

@service
public class StudentserviceImpl implements Studentservice{
    @Autowired
    StudentRepository studentRepository;

    public stuentity saveStudent(stuentity stuentity){
        return StudentRepository.save(stuentity);
    }
}