package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.NewsDao;
import com.it.show.model.News;

@Repository("newsDao")
@Lazy(true)
public class NewsDaoImpl extends BaseDaoImpl<News> implements NewsDao {

}
