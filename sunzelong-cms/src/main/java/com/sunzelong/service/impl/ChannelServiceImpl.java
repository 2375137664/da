package com.sunzelong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunzelong.dao.ChannelMapper;
import com.sunzelong.entity.Channel;
import com.sunzelong.service.ChannelService;

/**
 * 
 * @author 孙泽龙
 *
 */

@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper channelMapper;

	@Override
	public List<Channel> list() {
		// TODO Auto-generated method stub
		return channelMapper.list();
	}

}
