package com.cloud.consumer.safe.rest.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.cloud.consumer.safe.validator.group.UpdateGroup;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserInfoRequest implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户id", required = true)
    @NotNull(message = "用户id", groups = {UpdateGroup.class})
	private Integer userId;

    private Integer enterpriseId;

    @ApiModelProperty(value = "用户账户", required = true)
	@NotBlank(message = "用户账户", groups = {UpdateGroup.class})
    private String userAccount;

    @ApiModelProperty(value = "用户名称", required = true)
	@NotBlank(message = "用户名称")
    private String userName;

    @ApiModelProperty(value = "用户英文名称")
    private String userNameEn;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户头像")
    private String headImage;

	@ApiModelProperty(value = "备注")
    private String remark;

	@ApiModelProperty(value = "排序")
    private Integer sort;

}