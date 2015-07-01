/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：URLConnectionUtil.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月19日 Create
 * 1.1 Kai.Zhao 2015年6月19日 TODO
 */
package com.xxx.url.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;

/**
 * 银联连接中心
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class UnionPayConnectionUtil {

	/**
	 * URL请求
	 * 
	 * @param requestUrl URL地址
	 * @param jsonString JSON字符串
	 * @return
	 * @throws Exception
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static String doPost(String requestUrl, String jsonString) {
		OutputStream os = null;
		BufferedReader br = null;
		StringBuffer result = new StringBuffer();
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection.setFollowRedirects(false);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(POST);
			/*
			 conn.setRequestProperty("Content-Type", "text/html; charset=UTF-8");
			 conn.setRequestProperty("content_type", "application/x-www-form-urlencoded");
			 */
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setConnectTimeout(CONNECTION_TIME_OUT);
			conn.setReadTimeout(READ_TIME_OUT);
			conn.connect();
			os = conn.getOutputStream();
			os.write(jsonString.getBytes(UTF8));
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), UTF8));
			String line;
			while ((line = br.readLine()) != null) {
				result.append(line).append(WRAP);
			}
			if (!StringUtils.isBlank(result.toString())) {/*去掉最后一个换行*/
				return result.substring(0, result.length() - 1);
			} else {
				return result.toString();
			}
		} catch (Exception e) {
			return null;
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
			}
		}
	}

	/**连接超时时间*/
	private static final int CONNECTION_TIME_OUT = 50000;
	/**读取流超时时间*/
	private static final int READ_TIME_OUT = 300000;
	/**编码格式UTF-8*/
	public static final String UTF8 = "utf-8";
	/**POST*/
	public static final String POST = "POST";
	/**换行*/
	public static final String WRAP = "\n";
}
