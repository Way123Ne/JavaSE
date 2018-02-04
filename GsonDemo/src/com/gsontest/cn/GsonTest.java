package com.gsontest.cn;

import java.util.List;

import com.gsonentity.cn.Person;
import com.gsonentity.cn.Student;
import com.gsonutils.cn.GsonUtil;

public class GsonTest {
	/*
	 * json解析的三种方式:
	 * 1>gson(andorid项目中直接将gson.jar放入到libs文件夹下;java项目中需先将gson.jar放入项目中任意一个包中
	 * ,之后右击添加至构建路径) 2>jsonObject(传统) 3>fastjson(alibaba)
	 */
	public static void main(String[] args) {

		// 用GSON解析单条数据
		// String jsonData = "{'name':'john','age':'34'}";
		//Person person = GsonUtil.parseJsonWithGson(jsonData, Person.class);
		//System.out.println(person.getName() + "," + person.getAge());
		
		// 用GSON解析Json数组
		String jsonData = "[{'name':'John','grade':[{'course':'English','score':100},{'course':'Math','score':78}]},{'name':'Tom','grade':[{'course':'English','score':86},{'course':'Math','score':90}]}]";
		List<Student> students = GsonUtil.parseJsonWithGson(jsonData, Student.class);
		System.out.println(students);
	}

}
