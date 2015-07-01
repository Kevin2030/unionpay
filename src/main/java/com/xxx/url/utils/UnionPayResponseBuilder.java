/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：ResponseBuilder.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.utils;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.xxx.url.config.UnionPayConstant;
import com.xxx.url.model.UnionPayResult;

/**
 * 银联返回封装
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayResponseBuilder {

	/**
	 * 封装返回对象
	 * 
	 * @param result
	 * @param clazz
	 * @return
	 * @see
	 */
	public static UnionPayResult buildResponseParams(String result, Class<?> clazz) {
		if (StringUtils.isBlank(result)) {
			return UnionPayMessageHandleUtil.buildResult(UnionPayConstant.ReturnCode.FAILURE,
					UnionPayConstant.ReturnMessage.SERVICE_ERROR);
		}
		return UnionPayMessageHandleUtil.buildResult(getReturnCode(result), getReturnMessage(result),
				getData(result, clazz));
	}

	/**
	 * 获取DATA
	 * 
	 * @param result
	 * @param clazz
	 * @return
	 * @see
	 */
	private static Object getData(String result, Class<?> clazz) {
		return JSONObject.parseObject(JSONObject.parseObject(result).get(UnionPayConstant.DATA).toString(), clazz);
	}

	/**
	 * 获取返回码
	 * 
	 * @param result
	 * @return
	 * @see
	 */
	private static String getReturnCode(String result) {
		return JSONObject.parseObject(result).getJSONObject(UnionPayConstant.DATA)
				.getJSONObject(UnionPayConstant.RESPONSE_HEAD_DATA).getString(UnionPayConstant.RETURN_CODE);
	}

	/**
	 * 获取返回值
	 * 
	 * @param result
	 * @return
	 * @see
	 */
	private static String getReturnMessage(String result) {
		return JSONObject.parseObject(result).getJSONObject(UnionPayConstant.DATA)
				.getJSONObject(UnionPayConstant.RESPONSE_HEAD_DATA).getString(UnionPayConstant.RETURN_MESSAGE);
	}

}
