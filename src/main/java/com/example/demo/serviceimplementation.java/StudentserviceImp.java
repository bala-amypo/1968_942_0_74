package com.example.demo.serviceimplementation;

import org.springframework.stereotype.service;

import com.example.demo.entity.stuentity;
import com.example.demo.service.Studentservice;

@service
public class StudentserviceImpl implements Studentservice{
    private final StudentRepository studentRepository;
    public StudentserviceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public stuentity saveStudent(stuentity stuentity){
        return StudentRepository.save()
    }
}