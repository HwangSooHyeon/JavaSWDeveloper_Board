package com.example;

// 클래스명: LoopEx
public class LoopEx {
	int n;
	
	// 생성자: 클래스 명과 같음
	public LoopEx() { 
		//정의하지 않아도 존재하는 생성자이지만
		//만일 다른 생성자를 정의하면 소멸되므로
		//필요한 경우 작성해줄 필요가 있음
		
		// 아무것도 입력하지 않으면 위에 정의된 n에 5를 넣음
		this.n = 5;
	}
	
	// 숫자 1개를 입력 받는 생성자
	public LoopEx(int n) {
		
		// 입력한 값을 위에 정의된 n에 넣음
		this.n = n;
	}
	
	// 반환형이 있으므로 메소드 혹은 함수라고 부름
	public void print() {
		int i = 0;
		for(i=1; i<=n; i++) {
			System.out.print(i+" ");
		}
		// 여기서 i의 값은 n+1
	}
	
	public void print1() {
		int i=0;
		
		// 좋은 프로그램은 반복 횟수를 줄이는 것이 중요
		// 반복은 시간을 많이 잡아먹기 때문
		for(i=n; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public void print2() {
		int i=0;
		for(i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		// 위 반복과 같은 결과가 나오지만 반복 횟수는 1/2이므로
		// 아래가 좋은 코드
		for(i=2; i<=n; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	// 1 2 3 4 5 6 7 8 9 10 까지 반복하면서 3의 배수인 경우만 1 아니면 0
	// 0 0 1 0 0 1 0 0 1 0
	public void print3() {
		int i=0;
		for(i=1; i<=n; i++) {
			if(i%3==0) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
		System.out.println();
	}
	
	// break: loop 강제 종료
	public void print4() {
		for(int i=1; i<=n; i++) {
			if(i>=5) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	// continue:
	public void print5() {
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	

}
