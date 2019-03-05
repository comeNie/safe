package com.cloud.provider.safe.service;

import java.util.List;

import com.cloud.provider.safe.po.Enterprise;
import com.github.pagehelper.Page;

public interface IBootEnterpriseService {

    /**
	 * 分页查询
	 * @param page
	 * @param enterprise
	 * @return List<Enterprise>
	 */
	public List<Enterprise> selectEnterpriseListByPage(Page<?> page, Enterprise enterprise);

	/**
	 * 不分页查询
	 * @param enterprise
	 * @return List<Enterprise>
	 */
	public List<Enterprise> selectEnterpriseList(Enterprise enterprise);

    /**
     * 根据id查询企业
     * @param id
     * @return Enterprise
     */
	public Enterprise selectEnterpriseById(Integer id);

    /**
     * 插入企业
     * @param enterprise
     * @return Integer
     */
	public Integer insertEnterprise(Enterprise enterprise);

 	/**
  	 * 根据id删除企业
  	 * @param id
  	 * @return Integer
  	 */
	public Integer deleteEnterpriseById(Integer id);

    /**
     * 修改企业
     * @param enterprise
     * @return Integer
     */
	public Integer modifyEnterprise(Enterprise enterprise);

}