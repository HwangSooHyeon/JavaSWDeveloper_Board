package com.example;

// 외부에서 게시판 데이터를 받아와 출력해주는 클래스
public class BoardPrint {
	
	// 게시물 데이터를 보관하는 변수
	BoardVO[] a;
	
	public BoardPrint() {
		
	}
	
	// 외부에서 데이터를 받아오는 생성자
	public BoardPrint(BoardVO[] a) {
		this.a = a;
	}
	
	// 데이터를 출력하는 메소드
	public void print() {
		for(int i=0; i<a.length; i++) {
			BoardVO tmp = a[i]; // 객체에서 데이터를 꺼낸다음에 출력해야됨
			System.out.println(tmp.getNo() + ", " + tmp.getTitle() + ", " + tmp.getContent() +
					", " + tmp.getWriter() + ", " + tmp.getHit() + ", " + tmp.getDate());
		}
	}

}
