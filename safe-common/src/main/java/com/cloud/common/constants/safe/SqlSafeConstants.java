package com.cloud.common.constants.safe;

/**
 * (safe)安全数据库常量类 SqlSafeConstants
 * @author wei.yong
 */
public class SqlSafeConstants {

	/**********************************安全数据库常量**********************************/

	/**********************************企业常量**********************************/
	//企业状态 1-正常, 2-冻结, 3-注销
	public static final Integer SQL_ENTERPRISE_STATUS_NORMAL = 1;
	public static final Integer SQL_ENTERPRISE_STATUS_FREEZE = 2;
	public static final Integer SQL_ENTERPRISE_STATUS_CANCEL = 3;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_ENTERPRISE_IS_DELETE_NO = 0;
	public static final Integer SQL_ENTERPRISE_IS_DELETE_YES = 1;
	/**********************************企业常量**********************************/

	/**********************************基础用户常量**********************************/
	//基础用户状态 1-正常, 2-冻结, 3-注销
	public static final Integer SQL_BASE_USER_STATUS_NORMAL = 1;
	public static final Integer SQL_BASE_USER_STATUS_FREEZE = 2;
	public static final Integer SQL_BASE_USER_STATUS_CANCEL = 3;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_BASE_USER_IS_DELETE_NO = 0;
	public static final Integer SQL_BASE_USER_IS_DELETE_YES = 1;
	/**********************************基础用户常量**********************************/

	/**********************************基础用户登录日志常量**********************************/
	//登录类型 1-登录, 2-退出
	public static final Integer SQL_BASE_USER_LOGIN_LOG_LOGIN = 1;
	public static final Integer SQL_BASE_USER_LOGIN_LOG_LOGOUT = 2;
	/**********************************基础用户登录日志常量**********************************/

	/**********************************字典常量**********************************/
	//字典状态 0-无效, 1-有效
	public static final Integer SQL_DICT_STATUS_VALID = 0;
	public static final Integer SQL_DICT_STATUS_INVALID = 1;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_DICT_IS_DELETE_NO = 0;
	public static final Integer SQL_DICT_IS_DELETE_YES = 1;
	/**********************************字典常量**********************************/

	/**********************************字典子项常量**********************************/
	//字典状态 0-无效, 1-有效
	public static final Integer SQL_DICT_ITEM_STATUS_VALID = 0;
	public static final Integer SQL_DICT_ITEM_STATUS_INVALID = 1;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_DICT_ITEM_IS_DELETE_NO = 0;
	public static final Integer SQL_DICT_ITEM_IS_DELETE_YES = 1;
	/**********************************字典子项常量**********************************/

	/**********************************岗位常量**********************************/
	//是否特殊岗位 0-否, 1-是
	public static final Integer SQL_POST_IS_SPECIAL_NO = 0;
	public static final Integer SQL_POST_IS_SPECIAL_YES = 1;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_POST_IS_DELETE_NO = 0;
	public static final Integer SQL_POST_IS_DELETE_YES = 1;
	/**********************************岗位常量**********************************/

	/**********************************职务常量**********************************/
	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_TITLE_IS_DELETE_NO = 0;
	public static final Integer SQL_TITLE_IS_DELETE_YES = 1;
	/**********************************职务常量**********************************/

	/**********************************用户信息常量**********************************/
	//用户状态 1-正常, 2-冻结, 3-注销
	public static final Integer SQL_USER_STATUS_NORMAL = 1;
	public static final Integer SQL_USER_STATUS_FREEZE = 2;
	public static final Integer SQL_USER_STATUS_CANCEL = 3;

	//用户性别 0-未知, 1-男, 2-女
	public static final Integer SQL_USER_GENDER_UNKNOWN = 0;
	public static final Integer SQL_USER_GENDER_MAN = 1;
	public static final Integer SQL_USER_GENDER_WOMAN = 2;

	//用户类型, 1-手机, 2-账户
	public static final Integer SQL_USER_TYPE_MOBILE = 1;
	public static final Integer SQL_USER_TYPE_ACCOUNT = 2;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_USER_IS_DELETE_NO = 0;
	public static final Integer SQL_USER_IS_DELETE_YES = 1;
	/**********************************用户信息常量**********************************/

	/**********************************用户应用登录常量**********************************/
	//是否首次登录 0-否, 1-是
	public static final Integer SQL_USER_APP_LOGIN_FIRST_LOGIN_NO = 0;
	public static final Integer SQL_USER_APP_LOGIN_FIRST_LOGIN_YES = 1;
	/**********************************用户应用登录常量**********************************/

	/**********************************用户应用登录日志常量**********************************/
	//登录类型 1-登录, 2-退出
	public static final Integer SQL_USER_APP_LOGIN_LOG_LOGIN_TYPE_LOGIN = 1;
	public static final Integer SQL_USER_APP_LOGIN_LOG_LOGIN_TYPE_LOGOUT = 2;

	//日志类型 1-app, 2-微信公众号, 3-支付宝
	public static final Integer SQL_USER_APP_LOGIN_LOG_LOG_TYPE_APP = 1;
	public static final Integer SQL_USER_APP_LOGIN_LOG_LOG_TYPE_WX = 2;
	public static final Integer SQL_USER_APP_LOGIN_LOG_LOG_TYPE_ALIPAY = 3;
	/**********************************用户应用登录日志常量**********************************/

	/**********************************用户管理常量**********************************/
	//管理类型 1-主管理员, 2-子管理员, 3-负责人, 4-主管
	public static final Integer SQL_USER_ADMIN_TYPE_MASTER = 1;
	public static final Integer SQL_USER_ADMIN_TYPE_SLAVE = 2;
	public static final Integer SQL_USER_ADMIN_TYPE_FUZE = 3;
	public static final Integer SQL_USER_ADMIN_TYPE_ZHU = 4;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_USER_ADMIN_IS_DELETE_NO = 0;
	public static final Integer SQL_USER_ADMIN_IS_DELETE_YES = 1;
	/**********************************用户管理常量**********************************/

	/**********************************用户管理登录常量**********************************/
	//是否首次登录 0-否, 1-是
	public static final Integer SQL_USER_ADMIN_LOGIN_FIRST_LOGIN_NO = 0;
	public static final Integer SQL_USER_ADMIN_LOGIN_FIRST_LOGIN_YES = 1;
	/**********************************用户管理登录常量**********************************/

	/**********************************用户应用登录日志常量**********************************/
	//登录类型 1-登录, 2-退出
	public static final Integer SQL_USER_ADMIN_LOGIN_LOG_LOGIN_TYPE_LOGIN = 1;
	public static final Integer SQL_USER_ADMIN_LOGIN_LOG_LOGIN_TYPE_LOGOUT = 2;

	//日志类型 1-pc, 2-app
	public static final Integer SQL_USER_ADMIN_LOGIN_LOG_LOG_TYPE_PC = 1;
	public static final Integer SQL_USER_ADMIN_LOGIN_LOG_LOG_TYPE_APP = 2;
	/**********************************用户应用登录日志常量**********************************/

	/**********************************资质常量**********************************/
	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_QUALITY_IS_DELETE_NO = 0;
	public static final Integer SQL_QUALITY_IS_DELETE_YES = 1;
	/**********************************资质常量**********************************/

	/**********************************企业资质常量**********************************/
	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_ENTERPRISE_QUALITY_IS_DELETE_NO = 0;
	public static final Integer SQL_ENTERPRISE_QUALITY_IS_DELETE_YES = 1;
	/**********************************企业资质常量**********************************/

	/**********************************用户资质常量**********************************/
	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_USER_QUALITY_IS_DELETE_NO = 0;
	public static final Integer SQL_USER_QUALITY_IS_DELETE_YES = 1;
	/**********************************用户资质常量**********************************/

	/**********************************附件常量**********************************/
	//附件类型 1-图片, 2-word, 3-pdf
	public static final Integer SQL_ATTACHMENT_TYPE_PIC = 1;
	public static final Integer SQL_ATTACHMENT_TYPE_WORD = 2;
	public static final Integer SQL_ATTACHMENT_TYPE_PDF = 3;

	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_ATTACHMENT_IS_DELETE_NO = 0;
	public static final Integer SQL_ATTACHMENT_IS_DELETE_YES = 1;
	/**********************************附件常量**********************************/

	/**********************************岗位附件常量**********************************/
	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_POST_ATTACHMENT_IS_DELETE_NO = 0;
	public static final Integer SQL_POST_ATTACHMENT_IS_DELETE_YES = 1;
	/**********************************岗位附件常量**********************************/

	/**********************************资质附件常量**********************************/
	//删除标识 0-未删除，1-已删除
	public static final Integer SQL_QUALITY_ATTACHMENT_IS_DELETE_NO = 0;
	public static final Integer SQL_QUALITY_ATTACHMENT_IS_DELETE_YES = 1;
	/**********************************资质附件常量**********************************/














	/**********************************安全数据库常量**********************************/

}
