package com.cloud.consumer.safe.rest.request.page;

import com.cloud.consumer.safe.base.BaseRestRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TitlePageRequest extends BaseRestRequest {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "职务名称")
    private String titleName;

}