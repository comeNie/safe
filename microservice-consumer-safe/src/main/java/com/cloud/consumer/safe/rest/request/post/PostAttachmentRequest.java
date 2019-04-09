package com.cloud.consumer.safe.rest.request.post;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.cloud.consumer.safe.validator.group.UpdateGroup;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PostAttachmentRequest implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "岗位附件id")
	@NotNull(message = "岗位附件id不能为空", groups = {UpdateGroup.class})
	private Integer postAttachmentId;

	@ApiModelProperty(value = "岗位id", required = true)
	@NotNull(message = "岗位id不能为空")
    private Integer postId;

    @ApiModelProperty(value = "附件url", required = true)
	@NotBlank(message = "附件url不能为空")
    private String attachmentUrl;

	@ApiModelProperty(value = "备注")
    private String remark;

}