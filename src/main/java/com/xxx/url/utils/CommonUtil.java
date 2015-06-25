/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：CommonUtil.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import com.xxx.url.config.CommonConstant;

/** 
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class CommonUtil {

	/**
	 * Map是否为空
	 * 
	 * @param map
	 * @return
	 * @see
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isMapEmpty(Map map) {
		if (map == null || map.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * 生成序列号
	 * 
	 * @return
	 * @see
	 */
	public static String generateUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 格式化时间
	 * 
	 * @param date 时间
	 * @param defaultFormat 格式化 默认:yyyyMMddHHmmss
	 * @return
	 * @see
	 */
	public static String getFormatDate(Date date, String defaultFormat) {
		try {
			if (StringUtils.isBlank(defaultFormat)) {
				defaultFormat = CommonConstant.DATA_FORMAT_TYPE_ONE;
			}
			SimpleDateFormat sdf = new SimpleDateFormat(defaultFormat);
			return sdf.format(date);
		} catch (Exception e) {
			return "";
		}
	}

}
