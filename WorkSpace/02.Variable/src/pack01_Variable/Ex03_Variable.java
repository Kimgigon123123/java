package pack01_Variable;

public class Ex03_Variable {
	public static void main(String[] args) {

		int value=0 ;
		int result = value + 10; //오류발생, 초기화 되지않으면 변수 사용불가
		
//		int value = 10;
//		int result = value + 10;
		System.out.println(result);
		//숫자형 변수들은 사칙연산이 가능하다.
		//재할당. (변수를 계속 만드는게 아니라 값을 다시 줘서 바꿈)
		result=1+1+10;
		//result에 나머지 사칙연산의 결과를 저장하고 각각 출력해보기
		result=10-3;
		result=2*4;
		result=10/2;
		System.out.println(result);
		result=value;
		System.out.println(result);
	}

}
