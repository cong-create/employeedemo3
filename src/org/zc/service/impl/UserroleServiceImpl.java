package org.zc.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zc.mapper.UserroleMapper;
import org.zc.service.UserroleService;


@Service
public class UserroleServiceImpl implements UserroleService {
	@Autowired
	private UserroleMapper mapper;
	@Override
	public List<String> getUserRole(String uname) {
		return mapper.getUserRole(uname);
	}

	

}
