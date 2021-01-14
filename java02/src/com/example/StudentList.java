package com.example;

import java.util.ArrayList;
import com.example.vo.Subject;

public class StudentList {
	private int studentID = 0;						// 학번
	private String studentName = null;				// 학생 이름
	private Subject[] subjectArray = null;			// 수강 과목
	private ArrayList<Subject> subjectList = null;	// 수강 과목
	
	// 생성자	
	public StudentList() {
		super();
		subjectList = new ArrayList<Subject>();
	}

	public StudentList(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;	
		
		//subjectArray = new Subject[100]; // 100개 (정적이지만 동적보다 미세하게 빠름)
		subjectList = new ArrayList<Subject>(); // 갯수 존재 x (동적할당)
	}
		
	// getter, setter
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	// 메소드: 과목 1개씩 등록
	public int addSubject(String name, int score){
		try {
			Subject obj = new Subject(name, score);
			subjectList.add(obj);
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;		
		}
		
	}
	
	// 학생정보를 출력: 학번, 이름, 교과목 전체 내용 + 총점
	public void showStudentInfo() {
		System.out.println("학번: "+this.studentID);
		System.out.println("이름: "+this.studentName);
		
		// 반복할 때마다 신규 데이터로 갱신됨
		// 많이 씀. 그러나 인덱스를 알아야할 경우엔 못씀
		for(Subject tmp : subjectList) {
			System.out.println("교과목: "+tmp.getName()+" 점수: "+tmp.getScorePoint());
		}
		// 여기서 tmp를 확인하면 마지막 데이터만 남아있음
			
		
		// 임시 변수 없이 해당 배열 위치의 데이터만 출력
		// 잘 안씀. 갯수를 알아야하기 때문
		/*
		 * for(int i=0; i<subjectList.size(); i++) {
		 * System.out.println("교과목: "+subjectList.get(i).getName()+
		 * "점수: "+subjectList.get(i).getScorePoint()); }
		 */
		
	}
	

}
