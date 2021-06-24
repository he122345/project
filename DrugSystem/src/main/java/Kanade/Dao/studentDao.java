package Kanade.Dao;

import Kanade.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface studentDao {
    public int insertStudent(Student student);
    public int deleteStudent(int student_id);
    public int updateStudent(Student student);
    public Student findByIdStudent(int student_id);
    public List<Student> findAllStudent();
}
