package com.cloud.consumer.safe.service;

import com.alibaba.fastjson.JSONObject;

public interface IUserAppLoginService {

	/**
	 * 分页获取用户应用登录列表
	 * @param params
	 * @return JSONObject
	 */
	public JSONObject getListByPage(Object params);

	/**
	 * 获取用户应用登录列表
	 * @param params
	 * @return JSONObject
	 */
	public JSONObject getList(Object params);

	/**
	 * 根据id获取用户应用登录
	 * @param id
	 * @return JSONObject
	 */
	public JSONObject getById(Integer id);

	/**
	 * 新增用户应用登录
	 * @param params
	 * @return JSONObject
	 */
	public JSONObject add(Object params);

	/**
	 * 根据id删除用户应用登录
	 * @param id
	 * @return JSONObject
	 */
	public JSONObject deleteById(Integer id);

	/**
	 * 修改用户应用登录
	 * @param params
	 * @return JSONObject
	 */
	public JSONObject update(Object params);

}