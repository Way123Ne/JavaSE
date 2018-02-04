package com.gsonentity.cn;

import java.util.List;

public class Student {

	private String name;
	//grade为数组,所以需定义成List
	private List<Grade> grade;
	
	public class Grade {
		private String name;
		private String score;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Grade> getGrade() {
		return grade;
	}

	public void setGrade(List<Grade> grade) {
		this.grade = grade;
	}
	
}
