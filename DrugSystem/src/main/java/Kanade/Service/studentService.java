package Kanade.Service;

import Kanade.domain.Student;

import java.util.List;

public interface studentService {
    public int insertStudent(Student student);
    public int deleteStudent(int student_id);
    public int updateStudent(Student student);
    public Student findByIdStudent(int student_id);
    public List<Student> findAllStudent();
}
