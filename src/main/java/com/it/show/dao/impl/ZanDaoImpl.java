package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.ZanDao;
import com.it.show.model.Zan;

@Repository("zanDao")
@Lazy(true)
public class ZanDaoImpl extends BaseDaoImpl<Zan> implements ZanDao {

}
