package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.DiscussDao;
import com.it.show.model.Discuss;

@Repository("discussDao")
@Lazy(true)
public class DiscussDaoImpl extends BaseDaoImpl<Discuss> implements DiscussDao {

}
