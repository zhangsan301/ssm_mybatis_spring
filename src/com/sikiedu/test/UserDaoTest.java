package com.sikiedu.test;

import com.sikiedu.bean.User;
import com.sikiedu.dao.UserDao;
import com.sikiedu.dao.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class UserDaoTest {

    @Test
    public void DaoTest(){
    // UserDao dao=new UserDaoImpl(ssf);
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao=ac.getBean(UserDaoImpl.class);
     User user=userDao.getUserById(1);
     System.out.println(user);
    }

    @Test
    public void DaoTest2(){
        // UserDao dao=new UserDaoImpl(ssf);
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao=ac.getBean(UserDaoImpl.class);
        User user=userDao.getUserById(1);
        System.out.println(user);
    }

}
