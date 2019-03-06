package com.cloud.provider.safe.service;

import java.util.List;

import com.cloud.provider.safe.po.BaseUser;
import com.github.pagehelper.Page;

public interface IBaseUserService {

    /**
	 * 分页查询
	 * @param page
	 * @param baseUser
	 * @return List<BaseUser>
	 */
	public List<BaseUser> selectBaseUserListByPage(Page<?> page, BaseUser baseUser);

	/**
	 * 不分页查询
	 * @param baseUser
	 * @return List<BaseUser>
	 */
	public List<BaseUser> selectBaseUserList(BaseUser baseUser);

    /**
     * 根据id查询用户信息
     * @param id
     * @return BaseUser
     */
	public BaseUser selectBaseUserById(Integer id);

    /**
     * 插入用户信息
     * @param baseUser
     * @return Integer
     */
	public Integer insertBaseUser(BaseUser baseUser);

 	/**
  	 * 根据id删除基础用户
  	 * @param id
  	 * @return Integer
  	 */
	public Integer deleteBaseUserById(Integer id);

    /**
     * 修改用户信息
     * @param baseUser
     * @return Integer
     */
	public Integer modifyBaseUser(BaseUser baseUser);

}