package com.cloud.provider.safe.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.common.constants.safe.SqlSafeConstants;
import com.cloud.common.enums.safe.SafeResultEnum;
import com.cloud.provider.safe.dao.OrgQualityMapper;
import com.cloud.provider.safe.po.OrgQuality;
import com.cloud.provider.safe.po.OrgQualityExample;
import com.cloud.provider.safe.rest.request.page.enterprise.OrgQualityPageRequest;
import com.cloud.provider.safe.service.IOrgQualityService;
import com.cloud.provider.safe.util.Assert;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * 机构资质 OrgQualityService
 * @author wei.yong
 */
@Service
public class OrgQualityServiceImpl implements IOrgQualityService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    //机构资质 Mapper
    @Autowired
    private OrgQualityMapper orgQualityMapper;

    /**
	 * 分页查询
	 * @param page
	 * @param param
	 * @return List<OrgQuality>
	 */
	@Override
	public List<OrgQuality> selectListByPage(Page<?> page, OrgQualityPageRequest param) {
		logger.info("(OrgQualityService-selectListByPage)-分页查询-传入参数, page:{}, param:{}", page, param);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		OrgQualityExample example = new OrgQualityExample();
		example.setOrderByClause(" id desc ");
		OrgQualityExample.Criteria criteria = example.createCriteria();
		criteria.andIsDeleteEqualTo(SqlSafeConstants.SQL_ORG_QUALITY_IS_DELETE_NO);
		if(param != null) {
			if(param.getEnterpriseId() != null) {
				criteria.andEnterpriseIdEqualTo(param.getEnterpriseId());
			}
		}
		List<OrgQuality> list = orgQualityMapper.selectByExample(example);
		return list;
	}

	/**
	 * 不分页查询
	 * @param param
	 * @return List<OrgQuality>
	 */
	@Override
	public List<OrgQuality> selectList(OrgQualityPageRequest param) {
		logger.info("(OrgQualityService-selectList)-不分页查询-传入参数, param:{}", param);
		OrgQualityExample example = new OrgQualityExample();
		example.setOrderByClause(" id desc ");
		OrgQualityExample.Criteria criteria = example.createCriteria();
		criteria.andIsDeleteEqualTo(SqlSafeConstants.SQL_ORG_QUALITY_IS_DELETE_NO);
		if(param != null) {
			if(param.getEnterpriseId() != null) {
				criteria.andEnterpriseIdEqualTo(param.getEnterpriseId());
			}
		}
		List<OrgQuality> list = orgQualityMapper.selectByExample(example);
		return list;
	}

    /**
     * 根据id查询机构资质
     * @param id
     * @return OrgQuality
     */
	@Override
	public OrgQuality selectById(Integer id) {
    	logger.info("(OrgQualityService-selectById)-根据id查询机构资质-传入参数, id:{}", id);
		OrgQuality orgQuality = orgQualityMapper.selectByPrimaryKey(id);
		return orgQuality;
    }

    /**
     * 插入机构资质
     * @param orgQuality
     * @return Integer
     */
	@Override
	public Integer insert(OrgQuality orgQuality) {
    	logger.info("(OrgQualityService-insert)-插入机构资质-传入参数, orgQuality:{}", orgQuality);
    	orgQuality.setCreateTime(new Date());
    	orgQuality.setUpdateTime(new Date());
    	int i = orgQualityMapper.insertSelective(orgQuality);
    	Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
    	return i;
    }

 	/**
  	 * 根据id删除机构资质
  	 * @param id
  	 * @return Integer
  	 */
	@Override
	public Integer deleteById(Integer id) {
  		logger.info("(OrgQualityService-deleteById)-根据id删除机构资质-传入参数, id:{}", id);
  		int i = orgQualityMapper.deleteByPrimaryKey(id);
  		Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
  		return i;
  	}

    /**
     * 修改机构资质
     * @param orgQuality
     * @return Integer
     */
	@Override
	public Integer modify(OrgQuality orgQuality) {
    	logger.info("(OrgQualityService-modify)-修改机构资质-传入参数, orgQuality:{}", orgQuality);
    	orgQuality.setUpdateTime(new Date());
		int i = orgQualityMapper.updateByPrimaryKeySelective(orgQuality);
    	Assert.thanOrEqualZreo(i, SafeResultEnum.DATABASE_ERROR);
    	return i;
    }

}