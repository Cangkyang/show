package com.it.show.service;

import java.util.List;

public interface BaseService<T> {
	//添加数据
		public void save(T t);
		
		//更新数据
		public void update(T t);
		
		//删除数据
		public void delete(Integer id);
		
		// 仅仅查询当前对象, 不支持级联查询
		public List<T> query();
		
		//通过id取得数据
		public T get(Integer id);
}
