/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：RequestBuilder.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.utils;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONObject;
import com.xxx.url.config.UnionPayConstant;

/**
 * 银联请求封装
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayRequestBuilder {

	/**
	 * 封装请求报文
	 * 
	 * @param params 参数列表
	 * @param userID 用户内码
	 * @param bizType
	 * @param subBizType
	 * @return
	 * @see
	 */
	public static String buildRequestParams(HashMap<String, String> params, String userID, String bizType,
			String subBizType) {
		return buildBasicParams(buildData(params), userID, bizType, subBizType).toJSONString();
	}

	/**
	 * 封装主体报文
	 * 
	 * @param params 参数列表
	 * @return
	 * @see
	 */
	private static JSONObject buildData(HashMap<String, String> params) {
		JSONObject data = new JSONObject();
		if (!CommonUtil.isMapEmpty(params)) {
			Iterator<Entry<String, String>> it = params.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String, String> entry = it.next();
				if (entry != null) {
					data.put(entry.getKey(), entry.getValue());
				}
			}
		}
		data.put(UnionPayConstant.TARGET_ID, UnionPayConstant.HFB_DC);
		return data;
	}

	/**
	 * 封装头部报文
	 * 
	 * @param data 主体报文
	 * @param userID 用户内码
	 * @param bizType
	 * @param subBizType
	 * @return
	 * @throws Exception
	 * @see
	 */
	private static JSONObject buildBasicParams(JSONObject data, String userID, String bizType, String subBizType) {
		JSONObject requestParams = new JSONObject();
		requestParams.put(UnionPayConstant.DATA, data);
		requestParams.put(UnionPayConstant.USER_ID, userID);
		requestParams.put(UnionPayConstant.BIZ_TYPE, bizType);
		requestParams.put(UnionPayConstant.SUB_BIZ_TYPE, subBizType);
		requestParams.put(UnionPayConstant.MESSAGE_ID, CommonUtil.generateUUID());
		requestParams.put(UnionPayConstant.DATE_TIME, CommonUtil.getFormatDate(Calendar.getInstance().getTime(), ""));
		return requestParams;
	}

}
