package pack02.extend;

public class SubClass extends SuperClass {
	
	//두수의 곱하기 , 나누기 , 나머지 3개 메소드 구현해보기
	int mul(int x, int y) {
		return x*y;
	}
	
	int div(int x, int y) {
		return x/y;
	}
	
	int dir_re(int x, int y) {
		return x%y;
	}
}
