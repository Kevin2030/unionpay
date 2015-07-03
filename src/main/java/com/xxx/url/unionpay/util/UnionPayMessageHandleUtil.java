/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：BuilderUtil.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.unionpay.util;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.xxx.url.config.CommonConstant;
import com.xxx.url.unionpay.config.UnionPayConstant;
import com.xxx.url.unionpay.config.UnionPayResult;

/**
 * 银联信息处理
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayMessageHandleUtil {

	/**
	 * 组装返回报文
	 * 
	 * @param returnCode
	 * @param returnMessage
	 * @param data
	 * @return
	 * @see
	 */
	public static UnionPayResult buildResult(String returnCode, String returnMessage, Object data) {
		UnionPayResult result = new UnionPayResult();
		result.setReturnCode(returnCode);
		result.setReturnMessage(returnMessage);
		result.setData(data);
		return result;
	}

	/**
	 * 组装返回报文
	 * 
	 * @param returnCode
	 * @param returnMessage
	 * @param data
	 * @return
	 * @see
	 */
	public static UnionPayResult buildResult(String returnCode, String returnMessage) {
		UnionPayResult result = new UnionPayResult();
		result.setReturnCode(returnCode);
		result.setReturnMessage(returnMessage);
		return result;
	}

	/**
	 * 组装参数错误返回报文
	 * 
	 * @param returnCode
	 * @param returnMessage
	 * @param data
	 * @return
	 * @see
	 */
	public static UnionPayResult buildParamErrorResult() {
		UnionPayResult result = new UnionPayResult();
		result.setReturnCode(UnionPayConstant.ReturnCode.FAILURE);
		result.setReturnMessage(UnionPayConstant.ReturnMessage.REQUEST_PARAMS_EMPTY);
		return result;
	}

	/**
	 * 返回报文是否成功
	 * 
	 * @param result
	 * @return
	 * @throws Exception
	 * @see
	 */
	public static boolean isSuccess(UnionPayResult result) {
		boolean isSuccess = false;
		if (result == null) {
			return isSuccess;
		}
		String returnCode = result.getReturnCode();
		if (!StringUtils.isBlank(returnCode) && returnCode.equalsIgnoreCase(UnionPayConstant.ReturnCode.SUCCESS)) {
			isSuccess = true;
		}
		return isSuccess;
	}

	/**
	 * 获取银联返回信息
	 * 
	 * @param UnionPayResult
	 * @return
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static String getUnionPayReturnMessage(UnionPayResult result) {
		String defaultMesage = CommonConstant.ReturnMessage.UNION_PAY_FAILURE;
		if (result == null) {
			return defaultMesage;
		}
		String returnMessage = result.getReturnMessage();
		if (StringUtils.isBlank(returnMessage)) {
			return defaultMesage;
		}
		return returnMessage;
	}

	/**
	 * 获取银联返回数据
	 * 
	 * @param UnionPayResult
	 * @return
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static Object getUnionPayData(UnionPayResult result) {
		JSONObject defaultData = new JSONObject();
		if (result == null) {
			return defaultData.toJSONString();
		}
		Object returnData = result.getData();
		if (returnData == null || StringUtils.isBlank(returnData.toString())) {
			return defaultData.toJSONString();
		}
		return returnData;
	}

}
