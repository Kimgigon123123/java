
public class Ex03_Bool {public static void main(String[] args) {
	// true 와 false만 저장가능한 변수타입은?
	// true (1) , false (0)
	// AND 연산자 & , OR 연산자 |
	// or 연산자는 논리합? true(1) + false(0) = true(논리합은 하나의 true가 전체
	// 조건식을 true로 만듬)
	// 좋아하는 과일을 1가지 이상 선택해주세요.( 과일1=선택 , 과일2 , 과일3 )
	// and 연산자는 논리곱? true(1) * false(0) = false ( 논리곱은 모든 조건이 true
	//   일때만 true임)
	// 로그인 (아이디 맞고 (true) * 비밀번호가 맞고 (true) => true )
	
	// not => !
	// 어떤 true, false(bool)앞에 붙이면 해당 결과를 반전시킴.
	
	
	boolean boolT=true;
	boolean boolF=false;
	
	System.out.println(boolT);
	System.out.println(boolF);
	
	System.out.println(!boolT);
	System.out.println(!boolF);
	
}

}
