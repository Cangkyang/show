package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.ListDao;
import com.it.show.model.List;

@Repository("listDao")
@Lazy(true)
public class ListDaoImpl extends BaseDaoImpl<List> implements ListDao {

}
