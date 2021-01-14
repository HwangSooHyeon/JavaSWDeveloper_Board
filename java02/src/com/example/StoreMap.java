package com.example;

import java.util.HashMap;

import com.example.vo.Customer;

public class StoreMap {
	private String name = null;
	private String phone = null;
	
	// 고객 목록
	private HashMap<Integer, Customer> customerMap = new HashMap<Integer, Customer>();
	
	// 고객 등록
	public void addCustomer(int customerID, String customerName) {
		Customer customer = new Customer(customerID, customerName);
		//ArrayList와 차이점: 키를 가지고 있음
		customerMap.put(customerID, customer);

	}
	
	// 고객 삭제
	public int removeCustomer(int customerID) {
		Customer customer = customerMap.get(customerID);
		if(customer == null) {
			return 0;
		}
		return 1;
	}
	
	// 고객 정보 출력
	public void printCustomerMap() {
		System.out.println("===============================");
		for(int key : customerMap.keySet()) {
			Customer tmp = customerMap.get(key);
		}
	}

	public StoreMap() {
		super();
	}

	public StoreMap(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public HashMap<Integer, Customer> getCustomerMap() {
		return customerMap;
	}

	public void setCustomerMap(HashMap<Integer, Customer> customerMap) {
		this.customerMap = customerMap;
	}
	
	

}
