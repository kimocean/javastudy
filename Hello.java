package com.basic;

public class Hello {
// 클래스 영역
// 클래스 안에는 변수와 메소드가 살고 있음
	// 변수에는 데이터(숫자, 문자열, 참 또는 거짓)를 담는다
	
	// 메인 메소드가 있어야 exe파일로 만들 수 있다
	// 메인 메소드가 entry point이다 - 제일 먼저 실행됨
	// 메인 메소드이다 - 
	public static void main(String[] args) {
		// system이 가리키는 건 내가 사용 중인 pc
		// out변수는 출력장치를 의미
		// println은 출력 기능을 담당하는 '메소드'이다
		// 어디에 출력? - 콘솔창에
		// 출력을 해야 소통할 수 있다
		System.out.println("Hello World");
	} // end of main method - 기능, 처리, event

} // end of hello -  사용자 정의 클래스 선언 및 구현이 끝나는 것
