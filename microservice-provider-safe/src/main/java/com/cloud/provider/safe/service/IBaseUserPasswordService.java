package com.cloud.provider.safe.service;

import com.cloud.provider.safe.po.BaseUserPassword;

public interface IBaseUserPasswordService {

    /**
     * 根据id查询基础用户密码
     * @param id
     * @return BaseUserPassword
     */
	public BaseUserPassword selectBaseUserPasswordById(Integer id);

	/**
	 * 根据 baseUserId查询基础用户密码
	 * @param  baseUserId
	 * @return BaseUserPassword
	 */
	public BaseUserPassword selectBaseUserPasswordByBaseUserId(Integer baseUserId);

    /**
     * 插入基础用户密码
     * @param baseUserPassword
     * @return Integer
     */
	public Integer insertBaseUserPassword(BaseUserPassword baseUserPassword);

	/**
  	 * 根据id删除基础用户密码
  	 * @param id
  	 * @return Integer
  	 */
	public Integer deleteBaseUserPasswordById(Integer id);

    /**
     * 修改基础用户密码
     * @param baseUserPassword
     * @return Integer
     */
	public Integer modifyBaseUserPassword(BaseUserPassword baseUserPassword);

}