package com.example;
// sum, sub, mul, div, mod
public class Calc {
	private int num1 = 0;
	private int num2 = 0;
	
	// 생성자: public 클래스명(숫자1, 숫자2)
	// 만들 때 값을 세팅하고 싶으면 아래 처럼 변수를 받아오는 식으로 만듦
	public Calc() {
		
	} // 객체 생성 시 변수 받지 않는 방법
	
	public Calc(int a, int b) {
		num1 = a;
		num2 = b;
	} // 객체 생성 시 변수 받는 방법
		
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	//public 리턴타입 메소드명() {}
	public int sum() {
		return num1 + num2;		
	}
	public int sub() {
		return num1 - num2;
	}
	public float mul() {
		return num1 * num2;
	}
	public float div() {
		return num1 / num2;
	}
	public float mod() {
		return num1 % num2;
	}
	
}

