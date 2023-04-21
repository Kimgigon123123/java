
public class Test06 {public static void main(String[] args) {
	//test06 클래스를 하나만들고 int형 변수를 나열하여 5개 선언하고 
		//값을 각각의 과목 점수를 저장하기 위한 용도이다.(이름을 뭘로 할까?)
		//국어,수학,영어,과학,체육
		
		
	 int kor,math,eng,sci,phy;
	 kor=10;
	 math=20;
	 eng=30;
	 sci=40;
	 phy=50;
	 System.out.println(kor);
	 
	 //형변환(Casting) : 서로 다른 타입의 변수를 변환시켜 사용함
	 // ex) int <-> double , String <-> int
	 // int < double
	 int iValue=10;
	 double dValue=iValue+0.5; // 아무것도 한것 없음 ==> 자동 형변환
	 System.out.println("iValue 값 : "+iValue);
	 System.out.println("dValue 값 : "+dValue);
	 iValue=(int)dValue; // 문제가 발생함 = 수숫점 유실
	 
	 System.out.println("iValue 값 : "+iValue);
	 System.out.println("dValue 값 : "+dValue);
	 
	 
	 
	 String str="1234"+12;
	 //문자열에 어떤 값을 더하는 것 == 합x => 결합 (글자의 합침)
	 int iData=1234+12;
	 System.out.println(str);
	 System.out.println(iData);
	 //str에는 현재 123412라는 문자열이 되어있음.
	 //숫자로 바꾸려면 어떻게 해야할까? (""<=제거)
	 
	 int sum=Integer.parseInt(str)+1;
	 System.out.println(sum);
	 
	 // boolean (부울형) true 또는 false 만 저장이 가능함.
	 
	 String sum1=""+123+123+"가나다";
	 System.out.println(sum);
	 
	 String aaa="10";
	 int bbb=Integer.parseInt(aaa)+1;
	 System.out.println(bbb);
	
	double doubleNum=10.99999999;
	int intNum=(int)doubleNum+20;
	System.out.println(intNum);
	
	double ccc=Double.parseDouble(aaa)+23;
	System.out.println(ccc);
	
	double doNum=20.333;
	int inNum=(int)doNum;
	System.out.println(inNum);
}

}
