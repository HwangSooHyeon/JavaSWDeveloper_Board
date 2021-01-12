package com.example;

// 배열 실습
public class ArrayEx {
	
	// 배열 선언
	int[] a;
	
	public ArrayEx() {
		a = new int[5];
		a[0] = 12;
		a[1] = 12;
		a[2] = 12;
		a[3] = 12;
		a[4] = 12;
	}
	
	public ArrayEx(int[] a) {
		this.a = a;
	}
	
	public void print() {
		for(int i=0; i<a.length; i++) { // a의 길이 만큼 반복
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	// a라는 배열에서 값이 짝수인 것만 출력하시오.
	public void print1() {
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	
	// a 배열의 값에서 10 더해진 값을 출력하시오.
	public void print2() {
		for(int i=0; i<a.length; i++) {
			a[i]+=10;
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	// a 배열의 합계, 평균
	public void print3() {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		float avg = (float)sum/a.length;
		System.out.println("합은 "+sum+" 입니다.");
		System.out.println("평균은 "+avg+" 입니다.");
	}
	
	// a 배열의 최댓값
	public void print4() {
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("최대값은 "+max+" 입니다.");
	}
	
	// a 배열의 최솟값
	public void print5() {
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("최솟값은 "+min+" 입니다.");
	}
		
	// 문제) a 배열의 짝수합과 홀수합을 구하시오.
	public void print6() {
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 == 0) {
				evenSum = evenSum + a[i];
			}else {
				oddSum = oddSum + a[i];
			}
		}
				
		System.out.println("짝수합은 "+evenSum+" 이고,");
		System.out.println("홀수합은 "+oddSum+" 입니다.");
	}
	
	// 문제) a 배열의 값을 반대로 출력하시오.
	public void print7() {
		int[] invA = new int[a.length];
				
		for(int i=0; i<a.length; i++) {
			invA[(a.length - 1) - i] = a[i];	
		}
		
		System.out.print("배열 a 역순 출력: ");
		
		for(int i=0; i<a.length; i++) {
			System.out.print(invA[i]+" ");	
		}
		System.out.println();
	}	
	
	// 문제) a 배열의 위치가 3의 배수인 것들의 평균을 구하시오.
	public void print8() {
		int mulThree = 0;
		int den = 0;
		float mulThreeAvg = 0;
		
		for(int i=0; i<a.length; i++) {
			if(i%3 == 2) {
				mulThree = mulThree + a[i];
				den++;
			}
		}
		mulThreeAvg = (float)mulThree/(float)den;
		System.out.println("a 배열 위치가 3의 배수인 것들의 평균: "+mulThreeAvg);		
	}

}
