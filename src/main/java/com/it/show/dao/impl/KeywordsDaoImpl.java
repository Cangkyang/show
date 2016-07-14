package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.KeywordsDao;
import com.it.show.model.Keywords;

@Repository("keywordsDao")
@Lazy(true)
public class KeywordsDaoImpl extends BaseDaoImpl<Keywords> implements KeywordsDao {

}
