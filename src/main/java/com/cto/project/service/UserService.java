package com.cto.project.service;

import com.cto.project.entity.User;
import com.cto.project.entity.vo.UserVo;
import com.cto.project.service.base.BaseService;
import com.cto.project.utils.Page;
import org.springframework.stereotype.Service;

/**
 * 用户逻辑层
 * @author Zhang Yongwei
 * @date 2019-03-20
 * @version 1.0
 */
@Service
public interface UserService extends BaseService<User> {
    /**
     * 根据用户名查询
     * @param userName
     * @return
     */
    User selectByUserName(String userName);

    /**
     * 分页查询
     * @param userVo
     * @return
     */
    Page<User> selectPage(UserVo userVo);
}
