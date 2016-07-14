package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.CategoryDao;
import com.it.show.model.Category;

@Repository("categoryDao")
@Lazy(true)
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao {

}
