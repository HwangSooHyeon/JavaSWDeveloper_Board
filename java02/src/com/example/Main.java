package com.example;

import com.example.vo.Customer;

// ctrl + space 함수목록보기
// ctrl + shift + f 자동정렬
// ctrl + / 주석설정 및 해제

// CustomerList 클래스를 생성해서
// ArrayList<CustomerVO> 변수 생성
// CustomerVO의 객체를 3개 추가하고
// Main에서 CustomerList를 호출하고 CustomerPrint 출력하기

public class Main {

	public static void main(String[] args) {
		StoreList store = new StoreList("상점1", "051-123-4567");
		
		// 고객 등록
		store.addCustomer(1001, "홍길동");
		store.addCustomer(1005, "김철수");
		store.addCustomer(1002, "이영희");
		
		// 고객 삭제
		store.removeCustomer(1005);
		
		// 고객 정보 출력
		store.printStoreList();
		
		// 고객 검색
		// Customer customer = new Customer( , );
		// main 내에서 새로 만들어서 하는 것보다 외부에서 만들어진 것을 가져오는 것이 나음
		// main은 최대한 class에 덜 접근하는 것이 좋기 때문
		// 따라서 외부에서 데이터를 가져오기 때문에 아래처럼 예외처리를 해줘야함
		Customer customer = store.searchCustomer(1001);
		if(customer != null) {
			System.out.println(customer.toString());
		}
		else {
			System.out.println("고객 정보가 없습니다.");
		}
		
		
	}
}

