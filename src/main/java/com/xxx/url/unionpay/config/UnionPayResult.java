/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：ConnectionResult.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.unionpay.config;

/**
 * 银联返回结果
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayResult {

	/**返回代码*/
	private String returnCode;
	/**返回信息*/
	private String returnMessage;
	/**返回数据*/
	private Object data;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "UnionPayResult [returnCode=" + returnCode + ", returnMessage=" + returnMessage + ", data=" + data + "]";
	}

}
