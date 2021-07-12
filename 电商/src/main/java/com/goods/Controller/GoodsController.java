package com.goods.Controller;

import com.goods.Services.GoodsService;
import com.goods.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("goods")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class GoodsController {
    @Autowired
    private GoodsService _goods;
    @RequestMapping(value = "insertGoods",method = {RequestMethod.GET})
    public int insertGoods(Goods goods){
        return _goods.insertGoods(goods);
    }
    @RequestMapping(value = "deleteGoods/{id}",method = {RequestMethod.GET})
    public int deleteGoods(@PathVariable int id){
        return _goods.deleteGoods(id);
    }
    @RequestMapping(value = "updateGoods",produces = "application/json;charset=utf-8",method = {RequestMethod.GET})
    public int updateGoods(Goods goods){
        System.out.println(goods);
        return _goods.updateGoods(goods);
    }
    @RequestMapping(value = "findByIdGoods/{id}",method = {RequestMethod.GET})
    public List<Goods> findByIdGoods(@PathVariable int id){
        List<Goods> list=new ArrayList<Goods>();
        list.add(_goods.findByIdGoods(id));
        return list;
    }
    @RequestMapping(value = "findAllGoods",method = {RequestMethod.GET})
    public List<Goods> findAllGoods(){
        return _goods.findAllGoods();
    }
}
