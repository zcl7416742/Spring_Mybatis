package com.zcl.dao;

import com.zcl.mapper.UserMapper;
import com.zcl.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by Administrator on 2018-05-17.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao  {

    @Override
    public User testFindById(int id) throws Exception {

        UserMapper userMapper = this.getSqlSession().getMapper(UserMapper.class);

        User user = userMapper.selectByPrimaryKey(id);

        return user;
    }
}
