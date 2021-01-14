package com.example;

import java.util.ArrayList;

import com.example.vo.Subject;

public class ClassList {
	private String name = null; 						// 강의실 이름
	private int cnt = 0;								// 수용 인원
	private ArrayList<StudentList> studentList = null;	// 학생 목록
		
	// 생성자
	public ClassList() {
		super();
		this.studentList = new ArrayList<StudentList>();
	}

	public ClassList(String name, int cnt) {
		super();
		this.name = name;
		this.cnt = cnt;
		this.studentList = new ArrayList<StudentList>();
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public int addStudent(StudentList student) {
		try {
			studentList.add(student);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}
	
	public int removeStudent(StudentList student) {
		try {
			studentList.remove(student);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}	
	}
		
	public ArrayList<StudentList> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<StudentList> studentList) {
		this.studentList = studentList;
	}

	// 메소드: 반정보 확인
	public void showClassInfo() {
		System.out.println("==========================================");
		System.out.println("강의실 이름: "+this.name);
		System.out.println("수용 인원: "+this.cnt);
		
		// 학생 목록을 반복해서 학생 객체를 tmp에 보관
		for(StudentList tmp : studentList) {
			System.out.println("-------------------------------------");
			System.out.println("학번: "+tmp.getStudentID());
			System.out.println("학생 이름: "+tmp.getStudentName());
			
			// 교과목 리스트 출력하기
			ArrayList<Subject> subjectList = tmp.getSubjectList();
			for(Subject tmp1 : subjectList) {
				System.out.println("교과목명: "+tmp1.getName());
				System.out.println("교과목점수: "+tmp1.getScorePoint());
			}
		}
		
		System.out.println("==========================================");
		
	}
	

}
