package com.example;

public class Student {
	private String no = null;
	private String name = null;
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	
	
	public Student() {
		super();
	}


	public Student(String no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	public float avg() throws Exception {
		if(kor == 0 || eng == 0 || math == 0) {
			throw new Exception("Calculating error");
		}
		
		return (float)(kor+eng+math)/(float)3;
	}

}
