package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.PostDao;
import com.it.show.model.Post;

@Repository("postDao")
@Lazy(true)
public class PostDaoImpl extends BaseDaoImpl<Post> implements PostDao {

}
