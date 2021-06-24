package Kanade.Service;

import Kanade.Dao.studentDao;
import Kanade.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImp implements studentService{
    @Autowired
    private studentDao _student;
    @Override
    public int insertStudent(Student student) {
        return _student.insertStudent(student);
    }

    @Override
    public int deleteStudent(int student_id) {
        return _student.deleteStudent(student_id);
    }

    @Override
    public int updateStudent(Student student) {
        return _student.updateStudent(student);
    }

    @Override
    public Student findByIdStudent(int student_id) {
        return _student.findByIdStudent(student_id);
    }

    @Override
    public List<Student> findAllStudent() {
        return _student.findAllStudent();
    }
}
