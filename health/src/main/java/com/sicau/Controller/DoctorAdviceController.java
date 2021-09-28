package com.sicau.Controller;

import com.sicau.Service.DoctorAdviceService;
import com.sicau.domain.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 14:44
 * @message
 */
@RestController
@RequestMapping("doctorAdvice")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class DoctorAdviceController {
    @Autowired
    private DoctorAdviceService doctorAdviceService;
    @PostMapping("insert")
    public String insert(Doctor doctor){
        int msg;
        if(doctorAdviceService.findById(doctor.getId()).size()!=0){
            return "id已存在";
        }
        msg=doctorAdviceService.insert(doctor);
        if (msg==1) {return "插入成功";}
        else {return "插入失败";}

    }
    @GetMapping("del")
    public String del(int id){
        int msg;
        msg=doctorAdviceService.del(id);
        if (msg==1) {return "删除成功";}
        else {return "删除失败";}
    }
    @PostMapping("update")
    public String update(Doctor doctor){
        int msg;
        msg=doctorAdviceService.update(doctor);
        if (msg==1) {return "更新成功";}
        else {return "更新失败";}
    }
    @GetMapping("findById")
    List<Doctor> findById(int id){
        return doctorAdviceService.findById(id);
    }
    @GetMapping("findAll")
    List<Doctor> findAll(){
        return doctorAdviceService.findAll();
    }
}
