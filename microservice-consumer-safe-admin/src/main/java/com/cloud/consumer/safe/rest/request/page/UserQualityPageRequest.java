package com.cloud.consumer.safe.rest.request.page;

import com.cloud.consumer.safe.base.BaseRestRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserQualityPageRequest extends BaseRestRequest {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer userQualityId;

    private Integer userId;

    private Integer qualityId;

    private Integer isDelete;

    private String remark;

}