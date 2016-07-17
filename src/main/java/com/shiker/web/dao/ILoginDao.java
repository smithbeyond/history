package com.shiker.web.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author guohaifeng
 *         2016/7/17
 * @file
 */
@Repository("loginDao")
public interface ILoginDao {
    public List<Map<String, Object>> getUser(Map<String, Object> params);
}
