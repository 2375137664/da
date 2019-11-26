package com.sunzelong.service;

import java.util.List;

import com.sunzelong.entity.Category;
/***
 * 
 * @author 孙泽龙
 *
 * 2019年11月26日
 */
public interface CategoryService {

	/**
	 * 获取分类
	 * @param chnId  频道id
	 * @return
	 */
	List<Category> listByChannelId(int chnId);

}
