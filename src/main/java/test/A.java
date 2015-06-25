/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：A.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月25日 Create
 * 1.1 Kai.Zhao 2015年6月25日 TODO
 */
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;

/** 
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class A {

	private Integer aid;

	private B b;

	private List<C> c = new ArrayList<>();

	public A() {
		super();
	}

	public static void main(String[] args) {
		A a = new A();
		a.setAid(1);

		B b = new B();
		b.setBid(2);

		a.setB(b);
		//		b.setA(a);

		C c = new C();
		c.setId(3);

		a.getC().add(c);
		//		b.getC().add(c);
		//		c.setA(a);
		//		c.setB(b);

		ComplexPropertyPreFilter filter = new ComplexPropertyPreFilter();
		/*filter.setExcludes(new HashMap<Class<?>, String[]>() {
			private static final long serialVersionUID = -8411128674046835592L;
			{
				put(A.class, new String[] { "aid", "b" });
				put(B.class, new String[] { "bid" });
				put(C.class, new String[] { "id" });
			}
		});*/
		filter.setIncludes(new HashMap<Class<?>, String[]>() {

			private static final long serialVersionUID = -8898449888043428265L;
			{
				put(A.class, new String[] { "aid", "b", "c" });
				put(B.class, new String[] { "bid" });
				put(C.class, new String[] { "id" });
			}
		});
		System.out.println(JSON.toJSONString(a, filter));
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public List<C> getC() {
		return c;
	}

	public void setC(List<C> c) {
		this.c = c;
	}

}
