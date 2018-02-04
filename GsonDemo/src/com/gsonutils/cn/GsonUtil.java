package com.gsonutils.cn;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/*
 * ��װ��GSON���������࣬�ṩ���Ͳ���
 */
public class GsonUtil {

	//��Json���ݽ�������Ӧ��ӳ�����
	/*public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
		Gson gson = new Gson();
		T result = gson.fromJson(jsonData,type);
		return result;
	}
	*/
	//��Json���ݽ�������Ӧ��ӳ������б�
		public static <T> List<T> parseJsonWithGson(String jsonData, Class<T> type) {
			Gson gson = new Gson();
			List<T> result = gson.fromJson(jsonData,new TypeToken<List<T>>() {
			}.getType());
			return result;
		}
}
