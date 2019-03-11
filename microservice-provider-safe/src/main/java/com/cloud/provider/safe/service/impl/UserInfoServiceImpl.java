package com.cloud.provider.safe.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.common.enums.safe.SafeResultEnum;
import com.cloud.provider.safe.dao.UserInfoMapper;
import com.cloud.provider.safe.po.UserInfo;
import com.cloud.provider.safe.po.UserInfoExample;
import com.cloud.provider.safe.rest.request.page.UserInfoPageRequest;
import com.cloud.provider.safe.service.IUserInfoService;
import com.cloud.provider.safe.util.Assert;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * 用户信息 UserInfoService
 * @author wei.yong
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    //用户信息 Mapper
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
	 * 分页查询
	 * @param page
	 * @param param
	 * @return List<UserInfo>
	 */
	@Override
	public List<UserInfo> selectUserInfoListByPage(Page<?> page, UserInfoPageRequest param) {
		logger.info("(UserInfoService-selectUserInfoListByPage)-分页查询-传入参数, page:{}, param:{}", page, param);
		PageHelper.startPage(page);
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause(" id desc ");
		UserInfoExample.Criteria criteria = example.createCriteria();
		if(param != null) {
		}
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		return list;
	}

	/**
	 * 不分页查询
	 * @param param
	 * @return List<UserInfo>
	 */
	@Override
	public List<UserInfo> selectUserInfoList(UserInfoPageRequest param) {
		logger.info("(UserInfoService-selectUserInfoList)-不分页查询-传入参数, param:{}", param);
		UserInfoExample example = new UserInfoExample();
		UserInfoExample.Criteria criteria = example.createCriteria();
		if(param != null) {
		}
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		return list;
	}

    /**
     * 根据id查询用户信息
     * @param id
     * @return UserInfo
     */
	@Override
	public UserInfo selectUserInfoById(Integer id) {
    	logger.info("(UserInfoService-selectUserInfoById)-根据id查询用户信息-传入参数, id:{}", id);
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
		return userInfo;
    }

    /**
     * 插入用户信息
     * @param userInfo
     * @return Integer
     */
	@Override
	public Integer insertUserInfo(UserInfo userInfo) {
    	logger.info("(UserInfoService-insertUserInfo)-插入用户信息-传入参数, userInfo:{}", userInfo);
    	userInfo.setCreateTime(new Date());
    	userInfo.setUpdateTime(new Date());
    	int i = userInfoMapper.insertSelective(userInfo);
    	Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
    	return i;
    }

 	/**
  	 * 根据id删除用户信息
  	 * @param id
  	 * @return Integer
  	 */
	@Override
	public Integer deleteUserInfoById(Integer id) {
  		logger.info("(UserInfoService-deleteUserInfoById)-根据id删除用户信息-传入参数, id:{}", id);
  		int i = userInfoMapper.deleteByPrimaryKey(id);
  		Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
  		return i;
  	}

    /**
     * 修改用户信息
     * @param userInfo
     * @return Integer
     */
	@Override
	public Integer modifyUserInfo(UserInfo userInfo) {
    	logger.info("(UserInfoService-modifyUserInfo)-修改用户信息-传入参数, userInfo:{}", userInfo);
    	userInfo.setUpdateTime(new Date());
    	int i = userInfoMapper.updateByPrimaryKeySelective(userInfo);
//    	if(i<=0) {
//			throw new SafeException(SafeResultEnum.DATABASE_ERROR);
//		}
    	Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
    	return i;
    }

}