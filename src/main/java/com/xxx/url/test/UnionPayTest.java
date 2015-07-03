/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：URLTest.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.test;

import java.util.HashMap;

import org.junit.Test;

import com.xxx.url.unionpay.config.UnionPayConstant;
import com.xxx.url.unionpay.config.UnionPayResult;
import com.xxx.url.unionpay.config.UnionPayType;
import com.xxx.url.unionpay.core.UnionPayService;
import com.xxx.url.unionpay.model.AccountInfo;
import com.xxx.url.utils.MessageHandleUtil;

/** 
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayTest {

	@Test
	public void testQueryAccountInfo() {
		try {
			HashMap<String, String> params = new HashMap<String, String>();
			String userID = "132929392";
			String eAccNo = "EA1000000692";
			params.put(UnionPayConstant.USER_ID, userID);
			params.put(UnionPayConstant.E_ACC_NO, eAccNo);
			// .. 报文封装
			UnionPayResult result = UnionPayService.handle(params, userID, UnionPayType.queryAccountInfo,
					AccountInfo.class);
			System.out.println(MessageHandleUtil.buildUnionPayResult(result));
		} catch (Exception e) {
			System.out.println(MessageHandleUtil.buildUnionPayServiceErrorResult());
		}
	}
}
