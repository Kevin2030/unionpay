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

		public static final String QUERY_ERROR = "查询出错";
		public static final String INSERT_ERROR = "新增出错";
		public static final String UPDAT_EERROR = "更新出错";
		public static final String DELET_EERROR = "删除出错";
		public static final String SERVICE_TIME_OUT = "登录超时";
		public static final String SUCCESS = "操作成功";
		public static final String FAILURE = "操作失败";
		public static final String UNION_PAY_FAILURE = "银联操作失败";
		public static final String PAYEE_INSERT_REPEAT = "该银行卡号的收款人已经存在, 请重新修改";
		public static final String OPEN_SUB_ACCOUNT_FAILURE = "开通基金子账户失败";
		public static final String TRY_AGAIN_ATER = "密码错误次数太多, 请稍候重试";
		public static final String PASSWORD_LENGTH_ERROR = "交易密码长度6-16位, 不能有空格";
		public static final String VERIFY_FAILURE = "验证失败,请检查输入信息是否正确";
		public static final String VERIFY_TIMEOUT = "验证信息超时, 请重新进行验证";
		public static final String SERVICE_ERROR = "服务器异常,请稍候再试!";
		public static final String UNION_PAY_SERVICE_ERROR = "银联服务器异常,请稍候再试!";
		public static final String CLIENT_INPUT_ERROR = "客户端输入错误";
		public static final String ACCOUNT_PWD_ERROR = "交易密码错误";
		public static final String ACCOUNT_PWD_SIMILAR = "修改后的密码不能和原来密码相同";
		public static final String ACCOUNT_PWD_EMPTY = "交易密码失效, 请联系金蝶客服";
		public static final String TRANSFERFLOW_NO_REPEAT = "单据号重复或者已经过期, 请刷新后重试";
		public static final String MOBILE_PHONE_ERROR = "手机号输入错误";
		public static final String OLD_MOBILE_PHONE_ERROR = "原绑定手机号不正确";
		public static final String MOBILE_PHONE_REPEAT = "手机号未变更";
		public static final String MOBILE_PHONE_CHANGE = "手机号变更, 请重新根据手机号获取验证码";
		public static final String MOBILE_SEND_COUNT_OVERFLOW = "今天获取短信数已达上限, 请改天再试";
		public static final String REQUEST_ILLEGAL = "请求非法";
		public static final String SEND_SMS_ERROR = "发送短信失败";
		public static final String SEND_SMS_SUCCESS = "发送短信成功";
		public static final String SEND_SMS_SYSTEM_ERROR = "短信系统异常";
		public static final String VERIFY_CODE_TIMEOUT = "短信验证码已经过期, 请重新获取短信验证码";
		public static final String VERIFY_CAPTCHA_TIMEOUT = "请重新获取图片验证码";
		public static final String VERIFY_CODE_EMPTY = "验证码不能为空";
		public static final String VIRIFY_CODE_ERROR = "验证码输入错误";
		public static final String ACCOUNT_EXIST = "您已经开户, 请勿重复开户";
		public static final String BIND_CARD_EXIST = "请勿重复绑卡";
		public static final String NO_DATA_FOUND = "没有找到数据";
		public static final String ACCOUNT_NOT_OPEN = "没有找到开户数据";
		public static final String MOBILE_NOT_RIGHT = "预留手机号格式不正确";
		public static final String ACCOUNT_INFO_NOT_EXIST = "没有找到账户基本信息";
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
