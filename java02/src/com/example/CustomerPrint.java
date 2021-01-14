package com.example;

import java.util.ArrayList;

import com.example.vo.CustomerVO;
import com.example.vo.Subject;

public class CustomerPrint {
	private CustomerList customers = null;

	public CustomerPrint() {
		super();
	}

	public CustomerPrint(CustomerList customers) {
		super();
		this.customers = customers;
	}
	
	public void printCustomer() {
		System.out.println("==========================================");

		// 고객 목록을 반복해서 tmp에 보관 후 출력
		for(CustomerVO tmp : this.customers.getCustomerList()) {
			System.out.println("-------------------------------------");
			System.out.println("고객 이름: "+tmp.getId());
			System.out.println("고객 아이디: "+tmp.getName());
			System.out.println("고객 나이: "+tmp.getAge());
			System.out.println("가입 일자: "+tmp.getDate());
						
		}
		
		System.out.println("==========================================");
	}

}
