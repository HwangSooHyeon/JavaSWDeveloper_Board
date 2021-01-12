package com.example;

public class MemberVO {
	public String id = null;
	public String pw = null;
	public int age = 0;
	public String tel = null;
	public String date = null;
	public String addr = null;
	public String name = null;
		
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", age=" + age + ", tel=" + tel + ", date=" + date + ", addr="
				+ addr + ", name=" + name + "]";
	}	
	
}
