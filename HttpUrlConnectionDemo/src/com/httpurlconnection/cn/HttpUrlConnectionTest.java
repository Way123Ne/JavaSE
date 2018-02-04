package com.httpurlconnection.cn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.OutputStream;


public class HttpUrlConnectionTest {

	public static void main(String[] args) throws IOException{
		get();
		post();
	}
	public static void get() throws IOException {
		// TODO Auto-generated method stub
		String path = "http://www.baidu.com";
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(5*1000);
		conn.setRequestMethod("GET");
		InputStream is = conn.getInputStream();
		byte[] data = toByteArray(is);
		String result = new String(data,"UTF-8");
		System.out.println(result);
	}
	
	public static void post() throws IOException {
		// TODO Auto-generated method stub
		String encoding = "UTF-8";
		//post的from参数(json键值对)
		String params = "[{\"addTime\":\"2018-01-23 14:45:02\"[],\"iccid\":\"1111\",\"id\":0,\"imei\":\"2222\",\"imsi\":\"3333\",\"phoneType\":\"4444\",\"remark\":\"aaaa\",\"tel\":\"5555\"}]";
		String path = "http://www.baidu.com";
		byte[] data = params.getBytes(encoding);
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		
		conn.setRequestProperty("Content-Type", "application/x-javascript; charset=" + encoding);
		conn.setRequestProperty("Content-Length", String.valueOf(data.length));
		conn.setConnectTimeout(5*1000);
		OutputStream os = conn.getOutputStream();
		os.write(data);
		os.flush();
		os.close();
		//响应代码 200表示成功
		System.out.println(conn.getResponseCode()); 
		if (conn.getResponseCode() == 200) {
			InputStream is = conn.getInputStream();
			String result = new String(toByteArray(is),"UTF-8");
			//响应代码 200表示成功
			System.out.println(result);
		}
	}
	
	private static byte[] toByteArray(InputStream input) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[4096];
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			baos.write(buffer,0,n);
		}
		return baos.toByteArray();
	}

	
}
