package com.cloud.provider.safe.rest.request.page;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.cloud.provider.safe.base.BaseRestRequest;
import com.cloud.provider.safe.po.UserOrg;
import com.google.common.base.Converter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserOrgPageRequest extends BaseRestRequest {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer userOrgId;

    private Integer userId;

    private Integer orgId;

    private String created;

    private String updated;

    private Date createTime;

    private Date updateTime;

    /**
	 * 实体转换
	 * @return UserOrg
	 */
	public UserOrg convertToUserOrg() {
		UserOrgConvert convert = new UserOrgConvert();
		return convert.doForward(this);
	}

	/**
	 * req转换实体
	 * @author wei.yong
	 */
	private static class UserOrgConvert extends Converter<UserOrgPageRequest, UserOrg> {

		@Override
		protected UserOrg doForward(UserOrgPageRequest userOrgRequest) {
			UserOrg userOrg = new UserOrg();
			BeanUtils.copyProperties(userOrgRequest, userOrg);
			return userOrg;
		}

		@Override
		protected UserOrgPageRequest doBackward(UserOrg b) {
			return null;
		}

	}

}