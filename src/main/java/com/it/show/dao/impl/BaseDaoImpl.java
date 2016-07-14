package com.it.show.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.it.show.dao.BaseDao;

@SuppressWarnings("unchecked")
@Repository("baseDao")
@Lazy(true)
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory ;
	
	protected   Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	private Class clazz ;
	
	//构造方法
	public BaseDaoImpl(){
		System.out.println("****************************1*************************");
		// 如果子类调用当前构造方法,this代表的是子类对象
		System.out.println(this);
		
		System.out.println("获取父类信息:" + this.getClass().getSuperclass());
		
		System.out.println("获取父类信息包括泛型信息:" + this.getClass().getGenericSuperclass());
		
		System.out.println("参数类型获取开始！！！！！！！！！！");
		
		ParameterizedType type=(ParameterizedType)this.getClass().getGenericSuperclass();
		
		clazz=(Class)type.getActualTypeArguments()[0];
		
		System.out.println("*****************************2************************");
		System.out.println("clazz:" + clazz);
		System.out.println("*****************************3************************");
	}
	
	public void save(T t) {
		//这里做保存操作
		getSession().save(t) ;
	}

	public void update(T t) {
		// 这里做更新操作
		getSession().update(t); 
	}

	public void delete(Integer id) {
		//删除操作
		String hql = "DELETE FROM " + clazz.getSimpleName() + " c WHERE c.id=:id";
		getSession().createQuery(hql)	//
				.setInteger("id", id)	//
				.executeUpdate();
	}

	
	public List<T> query() {
		// 查询操作
		String hql = "FROM " + clazz.getSimpleName();
		return getSession().createQuery(hql) //
				.list();
	}

	public T get(Integer id) {
		// 通过id查询
		return (T) getSession().get(clazz, id);
	}

}
