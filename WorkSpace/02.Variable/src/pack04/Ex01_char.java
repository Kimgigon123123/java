package pack04;

public class Ex01_char {public static void main(String[] args) {
	//문자 데이터 타입 : char(2byte)
	//하나의 글자만 저장: 유니코드 
	//변수에 값을 할당(대입)할 때는 작은 따옴표를 사용한다.
	//작은 따옴표 ==싱글 코테이션=== '
	//소문자 a를 문자 데이터타입 char를 이용하여 초기화 해보기
	
	char kkk='a';
	System.out.println(kkk);
	char kkk2='b';
	char kkk3='★';
	char kkk4='가';
	System.out.println(kkk2);
	//char charError=''; 아무것도 없는것은 안된다 
	char charError = 'ab'; //문자가 아니라 문자열 안됨 (한글자만 된다)
	char cha5 = 65; //유니코드 진수형태로 문자와
	//특수문자 숫자를 표현할수있는 코드
	
	// 문자 하나를 담는 개념이나 사용법은 중요하지만
	// 데이터 타입 자체가 사용빈도가 낮기 때문에 복습 x
	
}


}
