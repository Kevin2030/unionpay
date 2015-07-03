package com.xxx.url.unionpay.model;

import java.io.Serializable;
import java.util.List;

/**
 * 账户信息查询
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class AccountInfo implements Serializable {

	private static final long serialVersionUID = 7175419354840488845L;

	/**
	 * 电子账号
	 */
	private String eAccNo;
	/**
	 * 客户姓名
	 */
	private String custName;
	/**
	 * 证件号码
	 */
	private String idNo;
	/**
	 * 手机号
	 */
	private String mobileNo;
	/**
	 * 客户号
	 */
	private String custId;
	/**
	 * 开户渠道
	 */
	private String openChannelId;
	/**
	 * 开户机构
	 */
	private String eAccBranchCode;
	/**
	 * 开户时间
	 */
	private String eAccOpenDate;
	/**
	 * 状态
	 */
	private String eAccStatus;
	/**
	 * 子账户信息
	 */
	private List<SubAccountInfo> subAccountInfoLists;

	public String getEAccNo() {
		return eAccNo;
	}

	public void setEAccNo(String eAccNo) {
		this.eAccNo = eAccNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getOpenChannelId() {
		return openChannelId;
	}

	public void setOpenChannelId(String openChannelId) {
		this.openChannelId = openChannelId;
	}

	public String getEAccBranchCode() {
		return eAccBranchCode;
	}

	public void setEAccBranchCode(String eAccBranchCode) {
		this.eAccBranchCode = eAccBranchCode;
	}

	public String getEAccOpenDate() {
		return eAccOpenDate;
	}

	public void setEAccOpenDate(String eAccOpenDate) {
		this.eAccOpenDate = eAccOpenDate;
	}

	public String getEAccStatus() {
		return eAccStatus;
	}

	public void setEAccStatus(String eAccStatus) {
		this.eAccStatus = eAccStatus;
	}

	public List<SubAccountInfo> getSubAccountInfoLists() {
		return subAccountInfoLists;
	}

	public void setSubAccountInfoLists(List<SubAccountInfo> subAccountInfoLists) {
		this.subAccountInfoLists = subAccountInfoLists;
	}

}
