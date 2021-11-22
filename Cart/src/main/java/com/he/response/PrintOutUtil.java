package com.he.response;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author he
 * @date 2021/11/18
 * @time 10:30
 * @message
 */
public class PrintOutUtil {
    public static void printJsonOut(HttpServletResponse response, ResultBean responseBean) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(JSONObject.toJSONString(responseBean).getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        outputStream.close();
    }

    public static void printHtmlOut(HttpServletResponse response, String v) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(v);
        response.getWriter().flush();
        response.getWriter().close();
    }
}
