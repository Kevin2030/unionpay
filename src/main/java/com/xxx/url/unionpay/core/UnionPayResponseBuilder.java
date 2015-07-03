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
package com.xxx.url.unionpay.core;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.xxx.url.unionpay.config.UnionPayConstant;
import com.xxx.url.unionpay.config.UnionPayResult;
import com.xxx.url.unionpay.util.UnionPayMessageHandleUtil;

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
	 * 获取返回码<br>
	 * 1、先从头部获取返回码，如果为空；<br>
	 * 2、再从body获取返回码，如果也为空；<br>
	 * 3、默认返回空串
	 * 
	 * @param result
	 * @return
	 * @see
	 */
	private static String getReturnCode(String result) {
		String headerReturnCode = JSONObject.parseObject(result).getJSONObject(UnionPayConstant.DATA)
				.getJSONObject(UnionPayConstant.RESPONSE_HEAD_DATA).getString(UnionPayConstant.RETURN_CODE);
		if (!StringUtils.isBlank(headerReturnCode)) {
			return headerReturnCode;
		}
		String bodyReturnCode = JSONObject.parseObject(result).getJSONObject(UnionPayConstant.DATA)
				.getString(UnionPayConstant.RETURN_CODE);
		if (!StringUtils.isBlank(bodyReturnCode)) {
			return bodyReturnCode;
		}
		return UnionPayConstant.ReturnCode.FAILURE;
	}

	/**
	 * 获取返回值<br>
	 * 1、先从头部获取返回值，如果为空；<br>
	 * 2、再从body获取返回值，如果也为空；<br>
	 * 3、默认返回空串
	 * 
	 * @param result
	 * @return
	 * @see
	 */
	private static String getReturnMessage(String result) {
		String headerReturnMessage = JSONObject.parseObject(result).getJSONObject(UnionPayConstant.DATA)
				.getJSONObject(UnionPayConstant.RESPONSE_HEAD_DATA).getString(UnionPayConstant.RETURN_MESSAGE);
		if (!StringUtils.isBlank(headerReturnMessage)) {
			return headerReturnMessage;
		}
		String bodyReturnMessage = JSONObject.parseObject(result).getJSONObject(UnionPayConstant.DATA)
				.getString(UnionPayConstant.RETURN_MESSAGE);
		if (!StringUtils.isBlank(bodyReturnMessage)) {
			return bodyReturnMessage;
		}
		return StringUtils.EMPTY;
	}

}
