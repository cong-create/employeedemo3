package org.zc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;


public interface UserroleMapper {

	@Select("select role from userrole where uname=#{uname}")
	List<String> getUserRole(String uname);
}
