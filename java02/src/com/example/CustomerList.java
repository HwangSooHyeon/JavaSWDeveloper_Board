package com.example;

import java.util.ArrayList;

import com.example.vo.CustomerVO;

public class CustomerList {
	private String customerID = null;
	private String customerName = null;
	private int customerAge = 0;
	private String signDate = null;
	private CustomerVO[] customerArray = null;
	private ArrayList<CustomerVO> customerList = null;
	
	public CustomerList() {
		super();
		customerList = new ArrayList<CustomerVO>();
		
	}

	public CustomerList(String customerID, String customerName, int customerAge, String signDate) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.signDate = signDate;
		
		customerList = new ArrayList<CustomerVO>();
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	
	public ArrayList<CustomerVO> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<CustomerVO> customerList) {
		this.customerList = customerList;
	}
	
	public int addCustomer(CustomerVO customer) {
		try {
			customerList.add(customer);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}	

}
