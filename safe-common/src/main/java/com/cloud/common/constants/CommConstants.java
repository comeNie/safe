package com.cloud.common.constants;

/**
 * 公共常量类
 *
 * @author S.J.
 * @date 2019/02/20
 */
public class CommConstants {

	//返回编码和信息
    public static final String RET_CODE = "retCode";
	public static final String RET_MSG = "retMsg";

    //操作成功-7个0
    public static final String OK = "0000000";
    //操作成功
    public static final String OK_MSG = "success";

    //分号
  	public static final String SEMICOLON = ";";
  	//逗号
  	public static final String COMMOA = ",";
  	//点号
  	public static final String DOT = ".";

	/*----------------------------- 系统统一错误编码 -----------------------------*/
    /**
     * 错误编码-系统错误
     */
    public static final String SYSTEM_ERROR = "00000001";
    /**
     * 错误描述-系统错误
     */
    public static final String SYSTEM_ERROR_MSG = "事务性异常";

    /**
     * 错误编码-数据不存在(数据库操作失败)
     * 数据库操作失败通用型编码，如果需要返回详细错误，请使用详细错误编码
     */
    public static final String DATABASE_ERROR = "00000002";
    /**
     * 错误描述-数据不存在(数据库操作失败)
     */
    public static final String DATABASE_ERROR_MSG = "数据操作失败";
    /*----------------------------- 系统统一错误编码 -----------------------------*/

}
