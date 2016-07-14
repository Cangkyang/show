package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.ExhibitionsDao;
import com.it.show.model.Exhibitions;

@Repository("exhibitionsDao")
@Lazy(true)
public class ExhibitionsDaoImpl extends BaseDaoImpl<Exhibitions> implements ExhibitionsDao {

}
