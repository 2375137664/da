package com.sunzelong.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunzelong.dao.CollectMapper;
import com.sunzelong.entity.Collect;
import com.sunzelong.service.CollectService;

/**
 * 
 * @author 孙泽龙
 *
 */
@Service
public class CollectServiceImpl  implements CollectService{
	
	@Autowired
	CollectMapper collectMapper;

	@Override
	public int add(Collect collect) {
		// TODO Auto-generated method stub
		return collectMapper.add(collect);
		
	}

	@Override
	public PageInfo list(int userId,int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,10);
		return new PageInfo<Collect>(collectMapper.list(userId));
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return collectMapper.delete(id);
	}

	@Override
	public Collect get(int id) {
		// TODO Auto-generated method stub
		return collectMapper.get(id);
	}

	@Override
	public int update(Collect collect) {
		// TODO Auto-generated method stub
		return collectMapper.update(collect);
		
	}

}
