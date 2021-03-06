package com.sunzelong.service;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.sunzelong.entity.Link;

/**
 * 
 * @author 孙泽龙
 *
 */
public interface LinkService {

	int add(Link link);
	PageInfo list(int page);
	int delete(int id);
	Link get(int id);
	int update( Link link);

}
