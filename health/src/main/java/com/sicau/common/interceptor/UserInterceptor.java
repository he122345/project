package com.sicau.common.interceptor;

import com.sicau.common.Response.PrintOutUtil;
import com.sicau.common.Response.ResultBean;
import com.sicau.common.Response.ResultEnum;
import com.sicau.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("user");
        if (user==null){
            PrintOutUtil.printJsonOut(response, ResultBean.fail().setResultEnum(ResultEnum.Permission_Denied));
        }
        return true;
    }
}
