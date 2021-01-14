package com.example;

import java.util.ArrayList;
import com.example.vo.Subject;

public class ClassPrint {
	private ClassList classes = null;
	
	public ClassPrint() {
		super();
	}

	public ClassPrint(ClassList classes) {
		super();
		this.classes = classes;
		
	}
	
	public void printClass() {
		System.out.println("==========================================");
		System.out.println("강의실 이름: "+this.classes.getName());
		System.out.println("수용 인원: "+this.classes.getCnt());
		
		// 학생 목록을 반복해서 학생 객체를 tmp에 보관
		for(StudentList tmp : this.classes.getStudentList()) {
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
