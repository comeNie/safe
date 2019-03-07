package com.cloud.provider.safe.rest.request.page;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.cloud.provider.safe.base.BaseRestRequest;
import com.cloud.provider.safe.po.UserPost;
import com.google.common.base.Converter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserPostPageRequest extends BaseRestRequest {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer userPostId;

    private Integer userId;

    private Integer postId;

    private String created;

    private String updated;

    private Date createTime;

    private Date updateTime;

    /**
	 * 实体转换
	 * @return UserPost
	 */
	public UserPost convertToUserPost() {
		UserPostConvert convert = new UserPostConvert();
		return convert.doForward(this);
	}

	/**
	 * req转换实体
	 * @author wei.yong
	 */
	private static class UserPostConvert extends Converter<UserPostPageRequest, UserPost> {

		@Override
		protected UserPost doForward(UserPostPageRequest userPostRequest) {
			UserPost userPost = new UserPost();
			BeanUtils.copyProperties(userPostRequest, userPost);
			return userPost;
		}

		@Override
		protected UserPostPageRequest doBackward(UserPost b) {
			return null;
		}

	}

}