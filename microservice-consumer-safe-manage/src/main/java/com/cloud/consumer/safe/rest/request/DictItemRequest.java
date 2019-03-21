package com.cloud.consumer.safe.rest.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.cloud.consumer.safe.validator.group.UpdateGroup;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DictItemRequest implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "字典子项id", required = true)
    @NotNull(message = "字典子项id", groups = {UpdateGroup.class})
	private Integer dictItemId;

	@ApiModelProperty(value = "字典id", required = true)
    @NotNull(message = "字典id")
    private Integer dictId;

	@NotBlank(message = "字典子项名称")
    private String itemName;

	@ApiModelProperty(value = "备注")
    private String remark;

	@ApiModelProperty(value = "排序")
    private Integer sort;

}