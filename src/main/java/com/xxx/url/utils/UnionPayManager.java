/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：ConnectionManager.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.utils;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xxx.url.config.UnionPayType;
import com.xxx.url.model.UnionPayResult;

/**
 * 银联管理中心
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayManager {

	private static final Logger logger = LoggerFactory.getLogger(UnionPayManager.class);

	/**请求银企地址 FIXME 该地址放在配置文件中*/
	private static final String REQUEST_URL = "http://172.20.10.48:5289/finance";

	/**
	 * 处理业务
	 * 
	 * @param params 参数列表
	 * @param userID 用户内码
	 * @param unionPayType 操作类型
	 * @param clazz 返回结果Bean
	 * @return
	 * @see
	 */
	public static UnionPayResult handle(HashMap<String, String> params, String userID, UnionPayType unionPayType,
			Class<?> clazz) {
		if (CommonUtil.isMapEmpty(params) || unionPayType == null) {
			return UnionPayMessageHandleUtil.buildParamErrorResult();
		}
		String requestParams = UnionPayRequestBuilder.buildRequestParams(params, userID, unionPayType.getBizType(),
				unionPayType.getSubBizType());
		logger.debug("[{} | {}] 请求报文:{}", userID, unionPayType.getMethodName(), requestParams);
		String result = UnionPayConnectionUtil.doPost(REQUEST_URL, requestParams);
		logger.debug("[{} | {}] 返回报文:{}", userID, unionPayType.getMethodName(), result);
		return UnionPayResponseBuilder.buildResponseParams(result, clazz);
	}
}
