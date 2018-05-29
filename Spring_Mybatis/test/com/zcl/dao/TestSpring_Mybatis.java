package com.zcl.dao;

import com.zcl.mapper.UserMapper;
import com.zcl.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018-05-17.
 */
public class TestSpring_Mybatis {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserByKey() throws Exception {

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        User user = userDao.testFindById(26);

        System.out.println("通过Dao来获取数据"+user);
    }

    @Test
    public void testFindUserByKey2() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

        User user = userMapper.selectByPrimaryKey(27);

        System.out.println(user);
    }
}
