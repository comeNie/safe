package com.cloud.consumer.safe.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ochain.common.constants.RetHttpUrlConstants;
import com.cloud.consumer.safe.service.IAccountCalculateLogService;

/**
 * 账户算力日志 Service (microservice-provider-wheel)
 * @author wei.yong
 */
@Service
public class AccountCalculateLogServiceImpl extends BaseService implements IAccountCalculateLogService {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 获取分页账户算力日志
	 * @param params
	 * @return JSONObject
	 */
	@Override
	public JSONObject getAccountCalculateLogListByPage(Map<String, Object> params) {
		logger.info("(AccountCalculateLogService-getAccountCalculateLogListByPage)-获取分页账户算力日志-传入参数, params:{}", params);
		HttpHeaders headers = this.getProviderWheelHeaders();
		HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<Map<String, Object>>(params, headers);
		JSONObject response = this.restTemplate.postForObject(RetHttpUrlConstants.HTTP_MICROSERVICE_PROVIDER_WHEEL+this.wheel_accountCalculateLog+"/selectAccountCalculateLogListByPage", httpEntity, JSONObject.class);
		return response;
	}

	/**
	 * 新增账户算力日志
	 * @param params
	 * @return JSONObject
	 */
	@Override
	public JSONObject addAccountCalculateLog(Map<String, Object> params) {
		logger.info("(AccountCalculateLogService-addAccountCalculateLog)-新增账户算力日志-传入参数, params:{}", params);
		HttpHeaders headers = this.getProviderWheelHeaders();
		HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<Map<String, Object>>(params, headers);
		JSONObject response = this.restTemplate.postForObject(RetHttpUrlConstants.HTTP_MICROSERVICE_PROVIDER_WHEEL+this.wheel_accountCalculateLog+"/insertAccountCalculateLog", httpEntity, JSONObject.class);
		return response;
	}

}