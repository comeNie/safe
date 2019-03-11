package com.cloud.provider.safe.rest.request;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.cloud.provider.safe.po.UserAdmin;
import com.google.common.base.Converter;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserAdminRequest implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer userAdminId;

    private Integer enterpriseId;

    private Integer userId;

    private String adminName;

    private Integer adminType;

	@ApiModelProperty(value = "备注")
    private String remark;

	@ApiModelProperty(value = "排序")
    private Integer sort;

    /**
	 * 实体转换
	 * @return UserAdmin
	 */
	public UserAdmin convertToUserAdmin() {
		UserAdminConvert convert = new UserAdminConvert();
		return convert.doForward(this);
	}

	/**
	 * req转换实体
	 * @author wei.yong
	 */
	private static class UserAdminConvert extends Converter<UserAdminRequest, UserAdmin> {

		@Override
		protected UserAdmin doForward(UserAdminRequest userAdminRequest) {
			UserAdmin userAdmin = new UserAdmin();
			BeanUtils.copyProperties(userAdminRequest, userAdmin);
			return userAdmin;
		}

		@Override
		protected UserAdminRequest doBackward(UserAdmin b) {
			return null;
		}

	}

}