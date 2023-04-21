import java.util.Scanner;

public class Ex04_ForFor {
	public static void main(String[] args) {
	//제어문은 무한하게 중첩이 가능하다.(순서x)
	// 1~10까지 반복하게 for문 만들어보기
	for(int i=1 ; i<=10;i++) {
		System.out.println(i);
		for(int j=1 ; j<=10;j++) {
			System.out.println(j);
		}
		//for문을 하나 더 넣을 수 있을까?
		//for문 하나 더 넣어보기(중첩)
		//총 몇회 동작을 할까? 1for * 2for = 10*10=100
		
	}

	System.out.println("-----");

	//구구단을 출력해보기 .print와 println을 적절히 사용하여.
	// 2x1=2
	// 2x2=4
	//출력예시 2x1=2, 2x2=4, 2x3=6
	int sum=0;
	for(int num1=2; num1<=9; num1++) {
		sum=num1;
		System.out.println(num1+"단");
		for(int num2=1;num2<=9;num2++) {
			System.out.println(sum+"X"+num2+"="+(num2*sum));
		}
	}
	System.out.println("------");
	for(int i =2;i<=9;i++) {
		System.out.println(i+"X"+1+"="+(i*1));
		for(int j=1;j<=9;j++) {
			System.out.print(i+"X"+j+"="+(i*j)+"   ");
		}
		System.out.println();
	}
	
	
	//다중 for문을 이용해서  별찍기
	// ★
	// ★★
	// ★★★
	// ★★★★
	// ★★★★★
	System.out.println("A");
	System.out.print("B");
	System.out.println("C");
	System.out.println("D");
	System.out.print("E");
	System.out.print("F");
	System.out.print("G");
	System.out.println();
	
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print("★");
		}System.out.println();
	}
	
	for(int i=1;i<=3;i++) {
	
		for(int j=1;j<=i;j++) {
			System.out.print("★");
		}System.out.println();
	}

	
	
	//System.out.println("★");
	//System.out.println("★★");
	//System.out.println("★★★");
	//System.out.println("★★★★");
	//System.out.println("★★★★★");
	
	//2~9반복<-사용자가 입력한 횟수
	//1~9반복
	//응용문제 Scanner를 
	//이용해서 숫자를 입력 받는다.
	// 입력 받은 숫자까지의 
	//구구단을 출력하는 
	//for문을 만들어보기
	//2미만의 숫자를
	// 입력하면 구구단을 출력x 
	// -> 잘못된 숫자라고 콘솔창에 출력만함
	// 2이상의 숫자가 입력되면 해당하는 단까지의 구구단을 출력하기
	
	Scanner sc= new Scanner (System.in);
	String inputData = sc.nextLine();
	int iNum=Integer.parseInt(inputData);
	if(iNum>=2&&iNum<=9) {for ( int i=1; i<=9 ; i++) {
		System.out.print(iNum+"X"+i+"="+(iNum*i)+"\t");
	}
	
	}else {
		System.out.println("잘못된 숫자");
	}
	
	Scanner sc2=new Scanner(System.in);
	String inputData2=sc2.nextLine();
	int iNum2=Integer.parseInt(inputData2)
	
}
}	

