package com.shiker.web.controller;

import com.shiker.web.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author guohaifeng
 *         2016/7/16
 * @file
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Resource(name = "loginService")
    private ILoginService loginService;

    @RequestMapping("login.ajax")
    public @ResponseBody
    Object login () {
        System.out.println("here is loginController");
        List<Map<String, Object>> dataList = loginService.login();
        System.out.println(dataList);
        return dataList;
    }
}
