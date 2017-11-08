package com.cai.jsonp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.WebArgumentResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * jsonp就是利用script标签的src不受跨域限制特性来实现的
 * Created by reason on 17/11/8.
 */
@RestController
public class JsonpController {

    @RequestMapping("/jsonp")
    public void testJsonp(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //关键：返回请求的函数名称+(data)
        String callback = request.getParameter("callback");
        //String out = "jsonpCallback({\"name\":\"liuhua\"})";
        String out = callback+"({\"name\":\"liuhua\"})";

        PrintWriter writer = response.getWriter();
        writer.print(out);
        writer.flush();
    }
}
