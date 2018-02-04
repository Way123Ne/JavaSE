package com.gsontest.cn;

import java.util.List;

import com.gsonentity.cn.Person;
import com.gsonentity.cn.Student;
import com.gsonutils.cn.GsonUtil;

public class GsonTest {
	/*
	 * json���������ַ�ʽ:
	 * 1>gson(andorid��Ŀ��ֱ�ӽ�gson.jar���뵽libs�ļ�����;java��Ŀ�����Ƚ�gson.jar������Ŀ������һ������
	 * ,֮���һ����������·��) 2>jsonObject(��ͳ) 3>fastjson(alibaba)
	 */
	public static void main(String[] args) {

		// ��GSON������������
		// String jsonData = "{'name':'john','age':'34'}";
		//Person person = GsonUtil.parseJsonWithGson(jsonData, Person.class);
		//System.out.println(person.getName() + "," + person.getAge());
		
		// ��GSON����Json����
		String jsonData = "[{'name':'John','grade':[{'course':'English','score':100},{'course':'Math','score':78}]},{'name':'Tom','grade':[{'course':'English','score':86},{'course':'Math','score':90}]}]";
		List<Student> students = GsonUtil.parseJsonWithGson(jsonData, Student.class);
		System.out.println(students);
	}

}
