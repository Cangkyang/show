package com.it.show.dao.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.AdvertDao;
import com.it.show.model.Advert;

@Repository("advertDao")
@Lazy(true)
public class AdvertDaoImpl extends BaseDaoImpl<Advert> implements AdvertDao {

}
