
public class Ex08_Oper {
	public static void main(String[] args) {
		//비교 연산자: 조건문에 많이 사용된다.
		// 조건 : 어떤 식이 참인지 또는 거짓인지를 판단하는것
		// id와 pw가 내가 입력한 값과 DB에 있는 값이 일치하는지?
		// "로그인" : "아이디 또는 비밀번호를 확인하세요"
		// ※ 조건은 반드시 true와 false의 답을 얻을수있어야한다.
		int num1= 10, num2=10;
		//==,!=,<=,>=,<,>
		//조건식을 사용하고나서는 결과가 반드시 true , false가 나온다
		boolean result1 = num1 == num2;
		System.out.println(result1);
		boolean result2 = num1 != num2;
		System.out.println(result2);
		boolean result3 = num1 >= num2;
		System.out.println(result3);
		boolean result4= num1 > num2;
		System.out.println(result4);
		boolean result5 = num1 <= num2;
		System.out.println(result5);
		boolean result6 = num1 < num2;
		System.out.println(result6);
		
		//식을 연결 ※:논리 연산자(여러개의 조건을 판단)
		//최종적인 결과 TRUE 또는 FALSE의 결과만 나온다.
		//조건식A && 조건식B: 조건식A가 참이고 조건식 B도 참일 경우 => true 그외에는 false
		//&&(AND,*,논리곱):1*1=1 
		//조건식A || 조건식B: 조건식A가 참이면 뒤에 조건과 상관없이 => true
		//||(or,+,논리합):1+?=0 , 0+0=0;
		System.out.println("----");
		System.out.println(10 > 5 && 20 > 10); // t
		System.out.println(10 > 5 && 20 < 5 ); // f
		System.out.println(5 > 10 && 20 > 5 ); // f
		System.out.println("----");
		System.out.println(10 > 5 || 20 > 10); // t
		System.out.println(10 > 5 || 20 < 5 ); // t
		System.out.println(5 > 10 || 20 > 5 ); // t
		System.out.println(10>5&&10>5||20>10);
		
	}

}
