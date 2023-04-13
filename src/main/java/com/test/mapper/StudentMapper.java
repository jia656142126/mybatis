package com.test.mapper;

import com.test.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> query();

    @Insert("insert into student values (#{id},#{name},#{age})")
    public int insertStudent(Student student);

    @Delete("delete from student where id=#{id}")
    public int deleteStudent(Student student);

    @Update("update student set name=#{name},age=#{age} where id=#{id}")
    public int updateStudent(Student student);

}
