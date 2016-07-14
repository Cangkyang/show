package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.UserDao;
import com.it.show.model.User;

@Repository("userDao")
@Lazy(true)
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
