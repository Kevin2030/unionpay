/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：UnionPayRequestType.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月25日 Create
 * 1.1 Kai.Zhao 2015年6月25日 TODO
 */
package com.xxx.url.unionpay.config;

/**
 * 银企业务操作类型
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public enum UnionPayType {

	/**查询账户信息*/
	queryAccountInfo("account", "hfb_accountinfo_query", "查询账户信息");
	private UnionPayType(String bizType, String subBizType, String methodName) {
		this.bizType = bizType;
		this.subBizType = subBizType;
		this.methodName = methodName;
	}

	/***/
	private String bizType;
	/***/
	private String subBizType;
	/***/
	private String methodName;

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSubBizType() {
		return subBizType;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
