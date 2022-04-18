package com.basic;

public class JFrameTest {
	// 선언부
	
	// 화면 그리기 - non-static의 메소드
	public void initDisplay() {
		
	}
	
	public static void methodA() {
		System.out.println("methodA 호출 성공");
	}
	
	// 메인 메소드
	// 메소드 선언 시 static이 있을 때와 없을 때가 다르다
	public static void main(String[] args) {
		// 인스턴스화를 통해서 선언돈 변수명을 인스턴스변수라고 부름
		JFrameTest jft = new JFrameTest();
		// 내안에 있는(현재 클래스에서 선언된) 메소드라 하더라도 static 영역 안에서 non-static메소드를 호출할 수는 없다
		// 본래 현재 클래스에 선언된 메소드는 내 안에서는 호출이 가능
		jft.initDisplay();
		// static이 붙은 메소드는 인스턴스화 없이도 사용 가능
		methodA();
	}

} // end of JFrameTest

/* static 영역 안에서 non-static 타입의 변수나 메소드 호출 불가
 * 선언부에 선언된 변수나 메소드는 본래 클래스 내부에서는 언제든 호출 가능한데 위에만 예외
 * 해결 방법: non-static 타입의 변수나 메소드를 사용할 때는 인스턴스화하면 접근 가능 */
 