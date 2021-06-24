package Kanade.Controller;

import Kanade.Service.doctorService;
import Kanade.domain.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("doctor")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class doctorController {
    @Autowired
    private doctorService _doctor;
    @RequestMapping(value = "insertDoctor",method = {RequestMethod.GET})
    public int insertDoctor(Doctor doctor) {
        return _doctor.insertDoctor(doctor);
    }
    @RequestMapping(value = "deleteDoctor/{doctor_id}",method = {RequestMethod.GET})
    public int deleteDoctor(@PathVariable("doctor_id") int doctor_id) {
        return _doctor.deleteDoctor(doctor_id);
    }
    @RequestMapping(value = "updateDoctor",method = {RequestMethod.GET})
    public int updateDoctor(Doctor doctor) {
        return _doctor.updateDoctor(doctor);
    }
    @RequestMapping(value = "findByIdDoctor/{doctor_id}",method = {RequestMethod.GET})
    public List<Doctor> findByIdDoctor(@PathVariable("doctor_id") int doctor_id) {
        List<Doctor> list=new ArrayList<Doctor>();
        list.add(_doctor.findByIdDoctor(doctor_id));
        return list;
    }
    @RequestMapping(value = "findAllDoctor",method = {RequestMethod.GET})
    public List<Doctor> findAllDoctor() {
        return _doctor.findAllDoctor();
    }
}
