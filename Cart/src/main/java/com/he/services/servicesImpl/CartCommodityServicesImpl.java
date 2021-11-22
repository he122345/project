package com.he.services.servicesImpl;
import com.he.Response.ResultBean;
import com.he.Response.ResultEnum;
import com.he.dao.CartCommodityDao;
import com.he.dao.MyCartDao;
import com.he.entity.CartCommodity;
import com.he.exception.LogException;
import com.he.services.CartCommodityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 *
 @author he
 @date 2021/11/17
 @time 23:16
 @message
 *
 */
@Service
public class CartCommodityServicesImpl implements CartCommodityServices {
    @Autowired
    private CartCommodityDao cartCommodityDao;
    @Autowired
    private MyCartDao myCartDao;
    @Override
    public ResultBean insert(CartCommodity cartCommodity) {
        if (cartCommodityDao.findByCartName(cartCommodity.getCartName()).size()!=0){
            throw new LogException(ResultEnum.Name_Exist);
        }
        cartCommodity.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        cartCommodity.setCreateTime(LocalDateTime.now().toString());
        cartCommodity.setVersion(0);
        int res=cartCommodityDao.insert(cartCommodity);
        if (res == 1) {
            return ResultBean.success().setMsg("新增成功");
        }
        throw new LogException(ResultEnum.Unknown_Error);
    }

    @Override
    public ResultBean del(String cartName) {
        if (cartCommodityDao.findByCartName(cartName).size() == 0){
            throw new LogException(ResultEnum.Commodity_Null);
        }
        if (myCartDao.findByCartName(cartName).size() != 0){
            throw new LogException(ResultEnum.Key_Rely);
        }
        int res=cartCommodityDao.del(cartName);
        if (res > 0){
            return ResultBean.success().setMsg("删除了"+res+"条数据");
        }
        throw new LogException(ResultEnum.Unknown_Error);
    }

    @Override
    public ResultBean update(CartCommodity cartCommodity) {
        List<CartCommodity> list=cartCommodityDao.findByCartName(cartCommodity.getCartName());
        if (list.size()==0){
            throw new LogException(ResultEnum.Commodity_Null);
        }
        CartCommodity c=list.get(0);
        // 检查数据是否变化
        if (c.getPicture().equals(cartCommodity.getPicture()) && c.getPrice().equals(cartCommodity.getPrice()) && c.getStock().equals(cartCommodity.getStock()) && c.getDescription().equals(cartCommodity.getDescription())){
            throw new LogException(ResultEnum.Not_Change);
        }
        LocalDateTime localDateTime=LocalDateTime.now();
        cartCommodity.setUpdateTime(localDateTime.toString());
        int res=cartCommodityDao.update(cartCommodity);
        if (res == 1){
            return ResultBean.success().setMsg("更新成功");
        }
        if (res == 0){
            throw new LogException(ResultEnum.Data_Overdue);
        }
        throw new LogException(ResultEnum.Unknown_Error);
    }

    @Override
    public ResultBean findByCartName(String cartName) {
        List<CartCommodity> list = cartCommodityDao.findByCartName(cartName);
        if (list.size() == 0) {
            throw new LogException(ResultEnum.Commodity_Null);
        }
        ResultBean resultBean=ResultBean.success();
        resultBean.setMsg("查找完成");
        return resultBean.data(list);
    }

    @Override
    public ResultBean findAll() {
        List<CartCommodity> list=cartCommodityDao.findAll();
        if (list.size() == 0){
            throw new LogException(ResultEnum.Commodity_Empty);
        }
        ResultBean resultBean=ResultBean.success();
        resultBean.setMsg("查找完成");
        return resultBean.data(list);
    }
}
