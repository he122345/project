package com.sicau.Controller;

import com.sicau.Service.UserCollectService;
import com.sicau.common.Response.ResultBean;
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
    public ResultBean insert(UserCollect userCollect){
        if (userCollectService.isExistD(userCollect.getCollect())==null||userCollectService.isExistU(userCollect.getId())==null){
            return ResultBean.fail().msg("id或者医生编号有误");
        }
        int msg;
        msg=userCollectService.insert(userCollect);
        if (msg==1) {return ResultBean.success().msg("收藏成功");}
        else {return ResultBean.fail().msg("收藏失败");}

    }
    @PostMapping("del")
    public ResultBean del(UserCollect userCollect){
        System.out.println(userCollect);
        int msg;
        msg=userCollectService.del(userCollect);
        if (msg!=0){
            return ResultBean.success().msg("删除成功");
        }
        else {return ResultBean.fail().msg("删除失败");}
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
