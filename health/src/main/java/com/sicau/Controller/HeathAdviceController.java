package com.sicau.Controller;

import com.sicau.Service.HealthAdviceService;
import com.sicau.domain.HealthAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 19:16
 * @message
 */
@RestController
@RequestMapping("healthAdvice")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class HeathAdviceController {
    @Autowired
    private HealthAdviceService healthAdviceService;
    @PostMapping("insert")
    public String insert(@RequestBody HealthAdvice healthAdvice){
        if (healthAdviceService.findById(healthAdvice.getId()).size()!=0){
            return "id已存在";
        }
        int msg;
        msg=healthAdviceService.insert(healthAdvice);
        if (msg==1) {return "插入成功";}
        else {return "插入失败";}

    }
    @GetMapping("del")
    public String del(@RequestParam("id") int id){
        int msg;
        msg=healthAdviceService.del(id);
        if (msg==1) {return "删除成功";}
        else {return "删除失败";}
    }
    @PostMapping("update")
    public String update(@RequestBody HealthAdvice healthAdvice){
        int msg;
        msg=healthAdviceService.update(healthAdvice);
        if (msg==1) {return "更新成功";}
        else {return "更新失败";}
    }
    @GetMapping("findById")
    HealthAdvice findById(int id){
        return healthAdviceService.findById(id).get(0);
    }
    @GetMapping("findAll")
    List<HealthAdvice> findAll(){
        return healthAdviceService.findAll();
    }
}
