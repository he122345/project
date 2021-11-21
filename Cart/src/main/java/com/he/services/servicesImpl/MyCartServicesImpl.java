package com.he.services.servicesImpl;

import com.he.Response.ResultBean;
import com.he.Response.ResultEnum;
import com.he.dao.CartCommodityDao;
import com.he.dao.MyCartDao;
import com.he.entity.MyCart;
import com.he.services.MyCartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 *
 @author he
 @date 2021/11/17
 @time 23:22
 @message
 *
 */
@Service
public class MyCartServicesImpl implements MyCartServices {
    @Autowired
    private MyCartDao myCartDao;
    @Autowired
    private CartCommodityDao cartCommodityDao;
    @Override
    public ResultBean insert(MyCart myCart) {
        if (myCartDao.findByCartName(myCart.getCartName()).size() != 0){
            return ResultBean.fail().setResultEnum(ResultEnum.Name_Exist);
        }
        if (cartCommodityDao.findByCartName(myCart.getCartName()).size() == 0){
            return ResultBean.fail().setResultEnum(ResultEnum.Commodity_Null);
        }
        myCart.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        myCart.setVersion(0);
        int res=myCartDao.insert(myCart);
        if (res == 1) {
            return ResultBean.success().setMsg("新增成功");
        }
        return ResultBean.fail().setMsg("未知原因");
    }

    @Override
    public ResultBean del(String cartName) {
        if (myCartDao.findByCartName(cartName).size()==0){
            return ResultBean.fail().setResultEnum(ResultEnum.Commodity_Null);
        }
        int res=myCartDao.del(cartName);
        if (res > 0){
            return ResultBean.success().setMsg("删除了"+res+"条数据");
        }
        return ResultBean.fail().setMsg("未知原因");
    }

    @Override
    public ResultBean update(MyCart myCart) {
        List<MyCart> list=myCartDao.findByCartName(myCart.getCartName());
        if (list.size()==0){
            return ResultBean.fail().setResultEnum(ResultEnum.Commodity_Null);
        }
        MyCart m=list.get(0);
        // 检测数据是否变化
        if (m.getQuantity().equals(myCart.getQuantity())){
            return ResultBean.fail().setResultEnum(ResultEnum.Not_Change);
        }
        int res=myCartDao.update(myCart);
        if (res == 1){
            return ResultBean.success().setMsg("更新成功");
        }
        if (res == 0){
            return ResultBean.fail().setResultEnum(ResultEnum.Data_Overdue);
        }
        return ResultBean.fail().setMsg("未知原因");
    }

    @Override
    public ResultBean findByCartName(String cartName) {
        List<MyCart> list=myCartDao.findByCartName(cartName);
        if (list.size() == 0){
            return ResultBean.fail().setResultEnum(ResultEnum.Commodity_Null);
        }
        ResultBean resultBean=ResultBean.success();
        resultBean.setMsg("查找完成");
        return resultBean.data(list);
    }

    @Override
    public ResultBean findAll() {
        List<MyCart> list=myCartDao.findAll();
        if (list.size() == 0){
            return ResultBean.fail().setResultEnum(ResultEnum.Commodity_Null);
        }
        ResultBean resultBean=ResultBean.success();
        resultBean.setMsg("查找完成");
        return resultBean.data(list);
    }
}
