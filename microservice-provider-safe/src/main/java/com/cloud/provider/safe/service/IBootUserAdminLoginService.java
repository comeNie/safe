package com.cloud.provider.safe.service;

import java.util.List;

import com.cloud.provider.safe.po.UserAdminLogin;
import com.github.pagehelper.Page;

public interface IBootUserAdminLoginService {

    /**
	 * 分页查询
	 * @param page
	 * @param userAdminLogin
	 * @return List<UserAdminLogin>
	 */
	public List<UserAdminLogin> selectUserAdminLoginListByPage(Page<?> page, UserAdminLogin userAdminLogin);

	/**
	 * 不分页查询
	 * @param userAdminLogin
	 * @return List<UserAdminLogin>
	 */
	public List<UserAdminLogin> selectUserAdminLoginList(UserAdminLogin userAdminLogin);

    /**
     * 根据id查询用户管理登录
     * @param id
     * @return UserAdminLogin
     */
	public UserAdminLogin selectUserAdminLoginById(Integer id);

    /**
     * 插入用户管理登录
     * @param userAdminLogin
     * @return Integer
     */
	public Integer insertUserAdminLogin(UserAdminLogin userAdminLogin);

    /**
     * 修改用户管理登录
     * @param userAdminLogin
     * @return Integer
     */
	public Integer modifyUserAdminLogin(UserAdminLogin userAdminLogin);

}