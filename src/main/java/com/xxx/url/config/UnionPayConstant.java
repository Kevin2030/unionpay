/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：UnionPayConstant.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月24日 Create
 * 1.1 Kai.Zhao 2015年6月24日 TODO
 */
package com.xxx.url.config;

/**
 * 银联交互常量
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayConstant {

	/**银企返回数据*/
	public static final String DATA = "data";
	/**恒丰虚拟账户*/
	public static final String E_ACC_NO = "eAccNo";
	/***/
	public static final String RETURN_CODE = "returnCode";
	/***/
	public static final String RETURN_MESSAGE = "errorMessage";
	/***/
	public static final String RESPONSE_HEAD_DATA = "responseHeadData";
	/***/
	public static final String TOTAL_NUM = "totalNum";
	/**银行标识，用户区分金蝶合作银行*/
	public static final String TARGET_ID = "targetid";
	/**用户内码*/
	public static final String USER_ID = "userid";
	/***/
	public static final String BIZ_TYPE = "biztype";
	/***/
	public static final String SUB_BIZ_TYPE = "subbiztype";
	/**流水号*/
	public static final String MESSAGE_ID = "messageid";
	/**时间*/
	public static final String DATE_TIME = "datetime";
	/***/
	public static final String CARD_NO = "cardNo";
	/***/
	public static final String CUST_ID = "custId";
	/**页码*/
	public static final String PAGE_NUMBER = "pageNumber";
	/**分页大小*/
	public static final String PAGE_SIZE = "pageSize";
	/**恒丰银行标识符*/
	public static final String HFB_DC = "HFB_DC";

	/**
	 * 银联返回码
	 * 
	 * @author Kai.Zhao
	 * @version 1.0
	 * @see
	 */
	public class ReturnCode {
		/**银联出错*/
		public static final String FAILURE = "999999";
		/**银联正常*/
		public static final String SUCCESS = "000000";
	}

	/**
	 * 银联返回信息
	 * 
	 * @author Kai.Zhao
	 * @version 1.0
	 * @see
	 */
	public class ReturnMessage {
		public static final String UNKNOWN_ERROR = "未知错误";
		public static final String SERVICE_ERROR = "银企平台异常,请稍候再试!";
		public static final String REQUEST_PARAMS_EMPTY = "参数错误";
	}

}
