package com.shiker.web.service.impl;

import com.shiker.web.dao.ILoginDao;
import com.shiker.web.service.ILoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guohaifeng on 2016/6/23.
 */
@Service("loginService")
public class LoginService implements ILoginService {
    @Resource(name = "loginDao")
    private ILoginDao loginDao;
    public List<Map<String, Object>> login() {
        System.out.println("here is LoginService");
        return loginDao.getUser(new HashMap<String, Object>());
    }
}
