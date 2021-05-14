package com.controller;

import com.Interface.impl.StudentImpl;
import com.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @Value("${server.port}")
    private String sort;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentImpl.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentImpl.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentImpl.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentImpl.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentImpl.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前服务端口是: "+this.sort;
    }



}
