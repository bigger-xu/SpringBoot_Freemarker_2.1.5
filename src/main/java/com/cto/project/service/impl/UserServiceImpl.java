package com.cto.project.service.impl;

import com.cto.project.dao.UserMapper;
import com.cto.project.entity.User;
import com.cto.project.entity.vo.UserVo;
import com.cto.project.service.UserService;
import com.cto.project.service.base.BaseServiceImpl;
import com.cto.project.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Yongwei
 * @version 1.0
 * @date 2019-03-20
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserMapper getNameSpace() {
        return userMapper;
    }

    @Override
    public User selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public Page<User> selectPage(UserVo userVo) {
        Page<User> page = new Page<>(userMapper.selectPageCount(userVo), userVo.getPageSize(), userVo.getPageNum());
        List<User> result = userMapper.selectPageList(userVo);
        page.setRows(result == null ? new ArrayList<>() : result);
        return page;
    }
}
