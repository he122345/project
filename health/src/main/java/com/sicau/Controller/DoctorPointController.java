package com.sicau.Controller;

import com.sicau.Dao.DoctorAdviceDao;
import com.sicau.Service.DoctorPointService;
import com.sicau.common.Response.ResultBean;
import com.sicau.domain.DoctorPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 19:10
 * @message
 */
@RestController
@RequestMapping("doctorPoint")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class DoctorPointController {
    @Autowired
    private DoctorPointService doctorPointService;
    @PostMapping("insert")
    public ResultBean insert(DoctorPoint doctorPoint){
        int msg;
        if (doctorPointService.isExist(doctorPoint.getId())==null){
            return ResultBean.fail().msg("医生id不存在");
        }
        msg=doctorPointService.insert(doctorPoint);
        if (msg==1) {return ResultBean.success().msg("插入成功");}
        else {return ResultBean.fail().msg("插入失败");}

    }
    @GetMapping("del")
    public String del(int id){
        int msg;
        msg=doctorPointService.del(id);
        return "影响了"+msg+"条数据";
    }
    @PostMapping("update")
    public String update(DoctorPoint doctorPoint){
        int msg;
        msg=doctorPointService.update(doctorPoint);
        return "影响了"+msg+"条数据";
    }
    @GetMapping("findById")
    List<DoctorPoint> findById(int id){
        return doctorPointService.findById(id);
    }
    @GetMapping("findAll")
    List<DoctorPoint> findAll(){
        return doctorPointService.findAll();
    }
}
