package com.tasly.gxx.service;


import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.tasly.gxx.domain.User;

public interface IUserService {
	public User getUserId(String id);
	
	public User findUserByLoginName(String loginName);

	public PageList<User> findUserForPage(int curPageSize, int limit);
	
	public boolean delUserByArray(String[] userIds);

	public boolean addUser(String userName, String userPass);
}
