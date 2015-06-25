package com.xxx.url.model;

import java.io.Serializable;

/**
 * 子账户信息
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class SubAccountInfo implements Serializable {

	private static final long serialVersionUID = 4505365216614183114L;

	/**
	 * 子账号
	 */
	private String subEAccNo;
	/**
	 * 子账户类型
	 */
	private String subEAccType;
	/**
	 * 币种
	 */
	private String currencyCode;
	/**
	 * 总余额
	 */
	private String totalBalance;
	/**
	 * 可用余额
	 */
	private String balance;
	/**
	 * 冻结余额
	 */
	private String freezeBalance;
	/**
	 * 基金代码
	 */
	private String fundCode;
	/**
	 * 基金公司
	 */
	private String fundCorp;

	public String getSubEAccNo() {
		return subEAccNo;
	}

	public void setSubEAccNo(String subEAccNo) {
		this.subEAccNo = subEAccNo;
	}

	public String getSubEAccType() {
		return subEAccType;
	}

	public void setSubEAccType(String subEAccType) {
		this.subEAccType = subEAccType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(String totalBalance) {
		this.totalBalance = totalBalance;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getFreezeBalance() {
		return freezeBalance;
	}

	public void setFreezeBalance(String freezeBalance) {
		this.freezeBalance = freezeBalance;
	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getFundCorp() {
		return fundCorp;
	}

	public void setFundCorp(String fundCorp) {
		this.fundCorp = fundCorp;
	}

}
