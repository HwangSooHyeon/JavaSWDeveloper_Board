package com.example.vo;

// 고객 테이블에 해당하는 객체
// VO는 데이터를 보관하기 위한 변수로서 사용하기 때문에
// 클래스 안에 연산과정은 넣지 않음
public class CustomerVO {
	private String id = null;	// 고객 아이디
	private String name = null;	// 고객 이름
	private int age = 0;		// 고객 나이
	private String date = null;	// 등록 일자
	
	// 생성자
	public CustomerVO() {
		super();
	}

	public CustomerVO(String id, String name, int age, String date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.date = date;
	}
	
	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	//toString
	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", name=" + name + ", age=" + age + ", date=" + date + "]";
	}

	
	
	
	
}
