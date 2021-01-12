package com.example;

public class Book {
	private String title = null;		// 책제목
	private int price = 0;				// 가격
	private String author = null;		// 저자
	private float discountRate = 0.0f;	// 할인율
	private String position = null;		// 책위치
		
	public Book() {
		
	}

	public Book(String title, int price, String author, float discountRate, String position) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.discountRate = discountRate;
		this.position = position;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}	
	
	public int sellingPrice() { //오류가 발생하면 프로그램을 닫음
		//price = 10000 - (10000*0.1);
		//int tmp = price - (int)price*discountRate);
		//return tmp;
		try {
			if(discountRate < 0) { // 오루 발생 시점
				throw new Exception("discountRate error");
			}
			return price - (int)(price*discountRate);
			
		}catch(Exception e) {
			// 개발자가 확인하기 위한 용도
			// e.getMessage(): 오류가 발생한 메시지
			System.err.println(e.getMessage());
			return -1;
			
		}
		
	}
	
	// 판매가격 구하기: 오류를 던진 경우에는 메소드에 오류 던진다고 정의, 오류가 발생하면 발생 사실만 알려줌
	public int sellingPrice1() throws Exception{
		if(discountRate < 0) { // 오루 발생 시점
			throw new Exception("discountRate error");
		}
		return price - (int)(price*discountRate);
	}

	@Override
	public String toString() {
		return "Book [title=" + this.title + ", price=" + this.price + ", author=" + this.author + ", discountRate=" + this.discountRate
				+ ", position=" + this.position + "]";
	}	
	
}
