package Kanade.Controller;

import Kanade.Dao.studentDao;
import Kanade.Service.studentService;
import Kanade.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("student")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class studentController {
    @Autowired
    private studentService _student;
    @RequestMapping(value = "insertStudent",method = {RequestMethod.GET})
    public int insertStudent(Student drug) {
        return _student.insertStudent(drug);
    }
    @RequestMapping(value = "deleteStudent/{drug_id}",method = {RequestMethod.GET})
    public int deleteStudent(@PathVariable("drug_id") int drug_id) {
        return _student.deleteStudent(drug_id);
    }
    @RequestMapping(value = "updateStudent",method = {RequestMethod.GET})
    public int updateStudent(Student drug) {
        return _student.updateStudent(drug);
    }
    @RequestMapping(value = "findByIdStudent/{drug_id}",method = {RequestMethod.GET})
    public List<Student> findByIdStudent(@PathVariable("drug_id") int drug_id) {
        List<Student> list=new ArrayList<Student>();
        list.add(_student.findByIdStudent(drug_id));
        return list;
    }
    @RequestMapping(value = "findAllStudent",method = {RequestMethod.GET})
    public List<Student> findAllStudent() {
        return _student.findAllStudent();
    }
}
