package com.cloud.provider.safe.rest.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.beans.BeanUtils;

import com.cloud.provider.safe.po.UserOrg;
import com.cloud.provider.safe.validator.group.ModifyGroup;
import com.google.common.base.Converter;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserOrgRequest implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户机构id", required = true)
    @NotNull(message = "用户机构id", groups = {ModifyGroup.class})
	private Integer userOrgId;

	@ApiModelProperty(value = "用户id", required = true)
    @NotNull(message = "用户id")
    private Integer userId;

	@ApiModelProperty(value = "机构id", required = true)
    @NotNull(message = "机构id")
    private Integer orgId;

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
	private static class UserOrgConvert extends Converter<UserOrgRequest, UserOrg> {

		@Override
		protected UserOrg doForward(UserOrgRequest userOrgRequest) {
			UserOrg userOrg = new UserOrg();
			BeanUtils.copyProperties(userOrgRequest, userOrg);
			return userOrg;
		}

		@Override
		protected UserOrgRequest doBackward(UserOrg b) {
			return null;
		}

	}

}