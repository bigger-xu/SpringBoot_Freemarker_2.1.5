package com.cto.project.dao;

import com.cto.project.dao.base.BaseDao;
import com.cto.project.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户Mapper
 * @author Zhang Yongwei
 * @date 2019-03-20
 * @version 1.0
 */
@Repository
public interface UserMapper extends BaseDao<User> {
    /**
     * 根据用户名查询
     * @param userName
     * @return
     */
    User selectByUserName(String userName);
}