/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：CommonConstant.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.config;

/**
 * 前端交互常量
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class CommonConstant {

	/**JSON返回状态码*/
	public static final String STATUS = "status";
	/**JSON返回信息*/
	public static final String MSG = "msg";
	/**JSON返回数据*/
	public static final String DATA = "data";
	/**时间格式化yyyyMMddHHmmss*/
	public static final String DATA_FORMAT_TYPE_ONE = "yyyyMMddHHmmss";

	/**
	 * 返回信息
	 * 
	 * @author Kai.Zhao
	 * @version 1.0
	 * @see
	 */
	public class ReturnMessage {
		public static final String SUCCESS = "操作成功";
		public static final String FAILURE = "操作失败";
		public static final String UNION_PAY_FAILURE = "银联操作失败";
		public static final String SERVICE_ERROR = "服务器异常,请稍候再试!";
		public static final String UNION_PAY_SERVICE_ERROR = "银联服务器异常,请稍候再试!";
	}

	/**
	 * 返回码
	 * 
	 * @author Kai.Zhao
	 * @version 1.0
	 * @see
	 */
	public class ReturnCode {
		/**成功*/
		public static final int SUCCESS = 200;
		/**服务器异常*/
		public static final int SERVICE_ERROR = 500;
		/**请求非法*/
		public static final int REQUEST_ILLEGAL = 501;
		/**超时*/
		public static final int SERVICE_TIME_OUT = 502;
		/**失败*/
		public static final int FAILURE = 600;
		/**客户端输入错误*/
		public static final int CLIENT_INPUT_ERROR = 601;
	}
}
