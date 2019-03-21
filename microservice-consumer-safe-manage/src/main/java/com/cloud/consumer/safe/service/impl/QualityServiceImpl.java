package com.cloud.consumer.safe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.cloud.common.constants.safe.SafeUrlConstants;
import com.cloud.consumer.safe.service.IQualityService;

/**
 * 用户职务 Service (microservice-provider-safe)
 * @author wei.yong
 */
@Service
public class QualityServiceImpl extends BaseService implements IQualityService {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 分页获取用户职务列表
	 * @param params
	 * @return JSONObject
	 */
	@Override
	public JSONObject getListByPage(Object params) {
		logger.info("(Service-getListByPage)-分页获取用户职务列表-传入参数, params:{}", params);
		JSONObject response = this.safePostForObject(SafeUrlConstants.quality+"/selectListByPage", params, JSONObject.class);
		return response;
	}

	/**
	 * 获取用户职务列表
	 * @param params
	 * @return JSONObject
	 */
	@Override
	public JSONObject getList(Object params) {
		logger.info("(Service-getList)-获取用户职务列表-传入参数, params:{}", params);
		JSONObject response = this.safePostForObject(SafeUrlConstants.quality+"/selectList", params, JSONObject.class);
		return response;
	}

	/**
	 * 根据id获取用户职务
	 * @param id
	 * @return JSONObject
	 */
	@Override
	public JSONObject getById(Integer id) {
		logger.info("(Service-getById)-根据id获取用户职务-传入参数, id:{}", id);
		JSONObject response = this.safePostForObject(SafeUrlConstants.quality+"/selectById/"+id, null, JSONObject.class);
		return response;
	}

	/**
	 * 新增用户职务
	 * @param params
	 * @return JSONObject
	 */
	@Override
	public JSONObject add(Object params) {
		logger.info("(Service-add)-新增用户职务-传入参数, params:{}", params);
		JSONObject response = this.safePostForObject(SafeUrlConstants.quality+"/insert", params, JSONObject.class);
		return response;
	}

	/**
	 * 根据id删除用户职务
	 * @param id
	 * @return JSONObject
	 */
	@Override
	public JSONObject deleteById(Integer id) {
		logger.info("(Service-deleteById)-根据id获取用户职务-传入参数, id:{}", id);
		JSONObject response = this.safePostForObject(SafeUrlConstants.quality+"/deleteById/"+id, null, JSONObject.class);
		return response;
	}

	/**
	 * 修改用户职务
	 * @param params
	 * @return JSONObject
	 */
	@Override
	public JSONObject update(Object params) {
		logger.info("(Service-update)-修改用户职务-传入参数, params:{}", params);
		JSONObject response = this.safePostForObject(SafeUrlConstants.quality+"/modify", params, JSONObject.class);
		return response;
	}

}