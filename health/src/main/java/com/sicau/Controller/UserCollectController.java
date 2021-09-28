package com.sicau.Controller;

import com.sicau.Service.UserCollectService;
import com.sicau.domain.UserCollect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 19:21
 * @message
 */
@RestController
@RequestMapping("userCollect")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class UserCollectController {
    @Autowired
    private UserCollectService userCollectService;
    @PostMapping("insert")
    public String insert(UserCollect userCollect){
        if (userCollectService.isExistD(userCollect.getCollect())==null||userCollectService.isExistU(userCollect.getId())==null){
            return "id或者collect有误";
        }
        int msg;
        msg=userCollectService.insert(userCollect);
        if (msg==1) {return "插入成功";}
        else {return "插入失败";}

    }
    @GetMapping("del")
    public String del(int id){
        int msg;
        msg=userCollectService.del(id);
        return "影响了"+msg+"条数据";
    }
    @PostMapping("update")
    public String update(UserCollect userCollect){
        if (userCollectService.isExistD(userCollect.getCollect())==null||userCollectService.isExistU(userCollect.getId())==null){
            return "id或者collect有误";
        }
        int msg;
        msg= userCollectService.update(userCollect);
        return "影响了"+msg+"条数据";
    }
    @GetMapping("findById")
    List<UserCollect> findById(int id){
        return userCollectService.findById(id);
    }
    @GetMapping("findAll")
    List<UserCollect> findAll(){
        return userCollectService.findAll();
    }
}
