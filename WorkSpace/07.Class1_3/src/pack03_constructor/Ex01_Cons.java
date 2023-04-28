package pack03_constructor;

import pack02_field.Ex01_Car;

public class Ex01_Cons {//Ex01_Cons();
	//우리 눈에 안보이지만 자바에서 기본적으로 객체를 인스턴스화 할때 사용하게 제공해주는 메소드
	//생성자 메소드
	
	//메소드
	//public, private, protected, default 의 접근 제한자.(추후 배움 무시) = > public
	// 접근 제한자 메소드의 타입 이름(){}
	
	public Ex01_Cons(int a) {
		System.out.println("여기가 실행됩니까?");
		System.out.println(a);
	}
}
