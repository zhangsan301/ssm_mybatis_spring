package com.sikiedu.dao;

import com.sikiedu.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {



    public User getUserById(Integer id) {

    SqlSession session = getSqlSession();
    //操作数据库
    return session.selectOne("UserMapper.selectUserById",id);
   }


}
