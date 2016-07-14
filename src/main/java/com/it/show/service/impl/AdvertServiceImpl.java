package com.it.show.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.it.show.model.Advert;
import com.it.show.service.AdvertService;

@Service("advertService")
public class AdvertServiceImpl extends BaseServiceImpl<Advert> implements
		AdvertService {
	//实现自己特有的业务
	
}
