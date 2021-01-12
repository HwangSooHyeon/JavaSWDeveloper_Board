package com.example;

public class BookStore {
	private String name = null;				// 서점명
	private String tel = null;				// 연락처
	private Book[] books = new Book[100];	// 최대 보유 가능 책
	private int bookCnt = 0;				// 보유하고 있는 책 수량
		
	public BookStore() {
		super();
	}

	public BookStore(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// method: 책 등록
	public void registerBook(Book book) {
		book.setPosition("위치1");
		
		// books라는 배열에 bookCnt위치에 1권 추가
		books[bookCnt] = book;
		
		// 위치를 1증가 시킴: 다음에 등록할 배열의 인덱스
		bookCnt++;
	}
	
	// 등록된 책 출력하기
	// 반복문을 등록한 개수만큼 회전하고 한개를 꺼내서 임시변수 tmp보관 후 getter을 이용하여 출력
	public void printBooks() throws Exception {
		// 책이 없는 경우에 오류를 발생시켜 던짐
		if(bookCnt<1) {
			throw new Exception("printBooks error");
		}
		for(int i=0; i<bookCnt; i++) {
			Book tmp = books[i]; // 오브젝트를 출력할 수 없기 때문에 tmp 변수로 받아와서 하나 씩 출력해야함
			//System.out.println(tmp.getTitle()+", "+tmp.getPrice()+
			//		", "+tmp.getAuthor()+", "+tmp.getDiscountRate()+", "+tmp.getPosition());
			System.out.println(tmp.toString());
		}
	}

}
