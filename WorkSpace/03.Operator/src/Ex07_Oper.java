public class Ex07_Oper {public static void main(String[] args) {
	// = (대입, 값 할당)
	// 비교 연산자 (== , < , > , <= , >=)
	// 초과, 미만 : 1 < 4 <<== 해당 식을 이용해서 0 이상의 숫자만쓰면
	// 몇부터 몇일까? 2~3
	// 이상, 이하 : 1 <=4 <<== 해당 식을 이용해서 0이상의 숫자만 쓰면
	// 몇부터 몇일까? 1~4
	
	int num=10;
	String result = num == 10? "맞다" : "틀리다" ;
	System.out.println(result);
	
	// 숫자가 10이면 1을 그리고 아니라면 2를 담는 이항연산자 써보기
	int resultInt = num == 10? 1 : 2;
	System.out.println(resultInt + result);
	// num에 있는 수가 9이하라면 true 그외에는 false를 담을수있는 식을 완성해보기
	
	int inum=9;
	boolean resultB = inum <=9? true : false;
	System.out.println(!resultB);
	
	
}

}
