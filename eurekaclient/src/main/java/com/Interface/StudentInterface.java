package com.Interface;

import com.entity.Student;

import java.util.Collection;

public interface StudentInterface {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);

}
