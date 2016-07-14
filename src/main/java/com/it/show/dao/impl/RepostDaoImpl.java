package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.RepostDao;
import com.it.show.model.Repost;

@Repository("repostDao")
@Lazy(true)
public class RepostDaoImpl extends BaseDaoImpl<Repost> implements RepostDao {

}
