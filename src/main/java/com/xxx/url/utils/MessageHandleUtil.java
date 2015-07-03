/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：MessageHandleUtil.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.utils;

import com.alibaba.fastjson.JSONObject;
import com.xxx.url.config.CommonConstant;
import com.xxx.url.unionpay.config.UnionPayResult;
import com.xxx.url.unionpay.util.UnionPayMessageHandleUtil;

/**
 * 前端信息处理
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class MessageHandleUtil {
	/**
	 * 组装返回报文
	 * 
	 * @param status 返回代码
	 * @param msg 返回信息
	 * @param data 返回结果
	 * @return
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static String buildResult(int status, String msg, Object data) {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.STATUS, status);
		json.put(CommonConstant.MSG, msg);
		json.put(CommonConstant.DATA, data);
		return json.toJSONString();
	}

	/**
	 * 组装返回报文
	 * 
	 * @param status 返回代码
	 * @param msg 返回信息
	 * @return
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static String buildResult(int status, String msg) {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.STATUS, status);
		json.put(CommonConstant.MSG, msg);
		return json.toJSONString();
	}

	/**
	 * 组装银联返回报文
	 * 
	 * @param result
	 * @return
	 * @see
	 */
	public static String buildUnionPayResult(UnionPayResult result) {
		if (!UnionPayMessageHandleUtil.isSuccess(result)) {
			return MessageHandleUtil.buildUnionPayFailureResult(result);
		}
		return MessageHandleUtil.buildUnionPaySuccessResult(result);
	}

	/**
	 * 组装银联失败返回报文
	 * 
	 * @param result
	 * @return
	 * @see
	 */
	public static String buildUnionPayFailureResult(UnionPayResult result) {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.STATUS, CommonConstant.ReturnCode.FAILURE);
		json.put(CommonConstant.MSG, UnionPayMessageHandleUtil.getUnionPayReturnMessage(result));
		return json.toJSONString();
	}

	/**
	 * 组装银联成功返回报文
	 * 
	 * @param result
	 * @return
	 * @see
	 */
	public static String buildUnionPaySuccessResult(UnionPayResult result) {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.STATUS, CommonConstant.ReturnCode.SUCCESS);
		json.put(CommonConstant.MSG, CommonConstant.ReturnMessage.SUCCESS);
		json.put(CommonConstant.DATA, UnionPayMessageHandleUtil.getUnionPayData(result));
		return json.toJSONString();
	}

	/**
	 * 组装银联服务器异常返回报文
	 * 
	 * @return
	 * @see
	 */
	public static String buildUnionPayServiceErrorResult() {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.STATUS, CommonConstant.ReturnCode.SERVICE_ERROR);
		json.put(CommonConstant.MSG, CommonConstant.ReturnMessage.UNION_PAY_SERVICE_ERROR);
		return json.toJSONString();
	}

	/**
	 * 组装服务器异常返回报文
	 * 
	 * @return
	 * @see
	 */
	public static String buildServiceErrorResult() {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.STATUS, CommonConstant.ReturnCode.SERVICE_ERROR);
		json.put(CommonConstant.MSG, CommonConstant.ReturnMessage.SERVICE_ERROR);
		return json.toJSONString();
	}
}
