package com.jsonobject.cn;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonObject {
	
	public static void main(String[] args) throws JSONException{
	
		JSONObject jsonobject1 = new JSONObject();
		JSONObject jsonobject2 = new JSONObject();
		JSONArray jsonarray = new JSONArray();
		
		jsonobject1.put("name", "Tom");
		jsonobject1.put("age", "14");
		jsonobject2.put("name", "david");
		jsonobject2.put("age", "78");
		
		jsonarray.put("abc");
		
		System.out.println("jsonobject1:"+"\r"+jsonobject1.toString());
		System.out.println("jsonobject2:"+"\r"+jsonobject2.toString());
		System.out.println("jsonarray:"+"\r"+jsonarray.toString());
	}
}
