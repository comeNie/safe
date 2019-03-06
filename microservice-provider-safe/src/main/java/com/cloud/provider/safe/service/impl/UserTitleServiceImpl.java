package com.cloud.provider.safe.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.common.enums.safe.SafeResultEnum;
import com.cloud.provider.safe.dao.UserTitleMapper;
import com.cloud.provider.safe.po.UserTitle;
import com.cloud.provider.safe.po.UserTitleExample;
import com.cloud.provider.safe.service.IUserTitleService;
import com.cloud.provider.safe.util.Assert;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * 用户职务 UserTitleService
 * @author wei.yong
 */
@Service
public class UserTitleServiceImpl implements IUserTitleService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    //用户职务 Mapper
    @Autowired
    private UserTitleMapper userTitleMapper;

    /**
	 * 分页查询
	 * @param page
	 * @param userTitle
	 * @return List<UserTitle>
	 */
	@Override
	public List<UserTitle> selectUserTitleListByPage(Page<?> page, UserTitle userTitle) {
		logger.info("(UserTitleService-selectUserTitleListByPage)-分页查询-传入参数, page:{}, userTitle:{}", page, userTitle);
		PageHelper.startPage(page);
		UserTitleExample example = new UserTitleExample();
		example.setOrderByClause(" id desc ");
		UserTitleExample.Criteria criteria = example.createCriteria();
		if(userTitle != null) {
		}
		List<UserTitle> list = userTitleMapper.selectByExample(example);
		return list;
	}

	/**
	 * 不分页查询
	 * @param userTitle
	 * @return List<UserTitle>
	 */
	@Override
	public List<UserTitle> selectUserTitleList(UserTitle userTitle) {
		logger.info("(UserTitleService-selectUserTitleList)-不分页查询-传入参数, userTitle:{}", userTitle);
		UserTitleExample example = new UserTitleExample();
		UserTitleExample.Criteria criteria = example.createCriteria();
		if(userTitle != null) {
		}
		List<UserTitle> list = userTitleMapper.selectByExample(example);
		return list;
	}

    /**
     * 根据id查询用户职务
     * @param id
     * @return UserTitle
     */
	@Override
	public UserTitle selectUserTitleById(Integer id) {
    	logger.info("(UserTitleService-selectUserTitleById)-根据id查询用户职务-传入参数, id:{}", id);
		UserTitle userTitle = userTitleMapper.selectByPrimaryKey(id);
		return userTitle;
    }

    /**
     * 插入用户职务
     * @param userTitle
     * @return Integer
     */
	@Override
	public Integer insertUserTitle(UserTitle userTitle) {
    	logger.info("(UserTitleService-insertUserTitle)-插入用户职务-传入参数, userTitle:{}", userTitle);
    	userTitle.setCreateTime(new Date());
    	userTitle.setUpdateTime(new Date());
    	int i = userTitleMapper.insertSelective(userTitle);
//    	if(i<=0) {
//			throw new SafeException(SafeResultEnum.DATABASE_ERROR);
//		}
    	Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
    	return i;
    }

 	/**
  	 * 根据id删除用户职务
  	 * @param id
  	 * @return Integer
  	 */
	@Override
	public Integer deleteUserTitleById(Integer id) {
  		logger.info("(UserTitleService-deleteUserTitleById)-根据id删除用户职务-传入参数, id:{}", id);
		int i = userTitleMapper.deleteByPrimaryKey(id);
  		Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
  		return i;
  	}

    /**
     * 修改用户职务
     * @param userTitle
     * @return Integer
     */
	@Override
	public Integer modifyUserTitle(UserTitle userTitle) {
    	logger.info("(UserTitleService-modifyUserTitle)-修改用户职务-传入参数, userTitle:{}", userTitle);
    	userTitle.setUpdateTime(new Date());
		int i = userTitleMapper.updateByPrimaryKeySelective(userTitle);
//    	if(i<=0) {
//			throw new SafeException(SafeResultEnum.DATABASE_ERROR);
//		}
    	Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
    	return i;
    }

}