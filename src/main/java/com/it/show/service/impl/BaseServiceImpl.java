package com.it.show.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.it.show.dao.AdvertDao;
import com.it.show.dao.BaseDao;
import com.it.show.service.BaseService;

@SuppressWarnings("unchecked")
@Service("baseService")
@Lazy(true)
public class BaseServiceImpl<T> implements BaseService<T> {
	
	private Class clazz ;
	
	protected BaseDao<T> baseDao ;
	
	@Resource(name="advertDao")
	protected AdvertDao advertDao ;
	
	@PostConstruct
	public void init() throws Exception{
		System.out.println("init方法执行开始！！！！！！！");
		baseDao = (BaseDao<T>) advertDao ;
		// 1: 根据具体的泛型, 获取相应的Field字段, categoryDao
		String clazzName=clazz.getSimpleName();
		String clazzDaoName=clazzName.substring(0,1).toLowerCase() + clazzName.substring(1) + "Dao";
		Field clazzField=this.getClass().getSuperclass().getDeclaredField(clazzDaoName);
		// 2: 获取baseDao Filed字段
		Field baseField=this.getClass().getSuperclass().getDeclaredField("baseDao");
		// 3: 把categoryDao的值赋值给baseDao
		baseField.set(this,clazzField.get(this));
		System.out.println("baseDao:" + baseDao);
	}
	
	
	public BaseServiceImpl() {
		System.out.println("=============BaseServiceImpl构造函数执行开始===================");
		// 如果子类调用当前构造方法,this代表的是子类对象
		System.out.println(this);
		System.out.println("获取父类信息:" + this.getClass().getSuperclass());
		System.out.println("获取父类信息包括泛型信息:"
				+ this.getClass().getGenericSuperclass());
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
		// 此处 dao还有没有实例化, 不能实现给baseDao的赋值操作
		System.out.println("baseDao:" + baseDao);
		System.out.println("advertDao:" + advertDao);
	}
	
	
	public void save(T t) {
		baseDao.save(t);
	}

	public void update(T t) {
		baseDao.update(t);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<T> query() {
		return baseDao.query() ;
	}

	public T get(Integer id) {
		return baseDao.get(id) ;
	}

}
