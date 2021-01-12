package com.example;

import java.util.Scanner;

import com.example.db.DBConn;
import com.example.vo.CustomerVO;

// ctrl + space 함수목록보기
// ctrl + shift + f 자동정렬
// ctrl + / 주석설정 및 해제

public class Main {

	public static void main(String[] args) {
		try {
			DBConn db = new DBConn(); // DB 접속
			
			Scanner scanner = new Scanner(System.in);
			int menu = 0;
			// 무한반복
			while(true) {
				System.out.println("1. INSERT, 2. UPDATE, 3.DELETE, 4. SELECT, 0. EXIT");
				
				// nextInt는 키보드 입력이 들어올 때까지 대기한다
				// 키보드로 데이터 입력 후 enter를 누르면 해당 데이터가 menu로 들어오고 대기상태가 끝난다
				// 메뉴 선택을 확인
				menu = scanner.nextInt();
				// 0. EXIT
				if(menu == 0) {
					System.out.println("종료되었습니다");
					break;
				}
				// 1. INSERT
				else if(menu == 1) {
					System.out.println("고객아이디를 입력하세요");
					String id = scanner.next();
					
					CustomerVO obj = new CustomerVO(id, "홍길동", 28, null);
					int result = db.insertCustomer(obj);

					if(result > 0) {
						System.out.println("고객등록성공");
					}else {
						System.out.println("고객등록실패");
					}
				}
				// 2. UPDATE
				else if(menu == 2) {
					System.out.println("변경할 고객아이디, 이름, 나이 순으로 입력하세요");
					String id = scanner.next();
					String name = scanner.next();
					int age = scanner.nextInt();
					db.updateCustomer(new CustomerVO(id, name, age, null));
					
				}
				// 3. DELETE
				else if(menu == 3) {
					System.out.println("삭제할 고객아이디를 입력하세요");
					String id = scanner.next();
					db.deleteCustomer(new CustomerVO(id, null, 0, null));
					
				}
				// 4. SELECT
				else if(menu == 4) {
					CustomerVO[] arr = db.selectCustomer();
					System.out.println("배열의 개수: "+arr.length);
				}
			}
			
			// scanner 종료
			scanner.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}			
	}
}

