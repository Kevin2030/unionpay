/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：B.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月25日 Create
 * 1.1 Kai.Zhao 2015年6月25日 TODO
 */
package test;

import java.util.ArrayList;
import java.util.List;

/** 
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class B {

	private Integer bid;

	private A a;

	private List<C> c = new ArrayList<>();

	public B() {
		super();
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public List<C> getC() {
		return c;
	}

	public void setC(List<C> c) {
		this.c = c;
	}

}
