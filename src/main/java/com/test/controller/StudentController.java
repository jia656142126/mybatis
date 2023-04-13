package com.test.controller;

import com.test.mapper.StudentMapper;
import com.test.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/query")
    public List<Student> query() {
        List<Student> list = studentMapper.query();
        System.out.println(list);
        return list;
    }
    @PostMapping("/save")
    public String save(Student student){
        int i = studentMapper.insertStudent(student);
        if (i > 0) {
            return "插入成功";
        }else {
            return "插入失败";
        }
    }
    @PostMapping("/del")
    public String del(Student student){
        int i= studentMapper.deleteStudent(student);
        if (i > 0) {
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
    @PostMapping("/update")
    public String update(Student student) {
        int i = studentMapper.updateStudent(student);
        if (i > 0) {
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
}
