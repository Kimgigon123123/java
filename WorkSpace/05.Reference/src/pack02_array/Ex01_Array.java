package pack02_array;

public class Ex01_Array {
	public static void main(String[] args) {
		//배열이란?
		//자료형 변수를 생성하고 사용할때 주로 쓰임.
		//규칙: "동일한" 데이터 타입을 묶어서 사용하게 하며 정해진 수만큼 저장 처리하는
		//"객체"=> 한번 만든 크기는 다시 바꾸는게 불편하다
		//형태 dataType[]name=new dataType[size];
		//   데이터타입[]배열이름=new데이터타입[크기];
		
		//아직 스캐너나 별도의 처리로 점수를 입력하지 않은 변수 5개를 준비만 해둠.
		int score1=0,score2=0,score3=0,score4=0,score5=0;
		//score 1~5까지의 합: score1+2+3...+score5= 합
	int[]scoreArray=new int[100];// 0[0] 1[0] 2[0] 3[0] 4[0]
		//배열의 인덱스 규칙:n의 크기가 주어진 배열은 0부터 n-1까지의 주소를 가진다.
	System.out.println("scoreArray[0]값:"+scoreArray[0]);
	System.out.println(scoreArray);//[I@515f550a=> 힙영역의 주소(메모리) 값x
	scoreArray[1]=20; //배열에 데이터 타입이 주어졌으면 해당하는 타입의 변수라고 생각
	System.out.println("scoreArray[1]값:"+scoreArray[1]);
	scoreArray[0]=10;
	scoreArray[1]=20;
	scoreArray[2]=30;
	scoreArray[3]=40;
	scoreArray[4]=50;
	System.out.println("scoreArray[0]값:"+scoreArray[0]);
	System.out.println("scoreArray[1]값:"+scoreArray[1]);
	System.out.println("scoreArray[2]값:"+scoreArray[2]);
	System.out.println("scoreArray[3]값:"+scoreArray[3]);
	System.out.println("scoreArray[4]값:"+scoreArray[4]);
	
	int a=0;
	int b=10;
	while(a<5) {
		scoreArray[a]=b;
		System.out.println("scoreArray["+a+"]값:"+scoreArray[a]);
		a++;
		b+=10;
		
	}
	
	//반복문을쓰자
	//반복문으로 scorArray에 값을 모두 출력해보기
	//int[]scoreArray=new int[100]; (저장 크기를 100으로)
	
	

	int c=0;
	int d=10;
	while(c<100) {
		scoreArray[c]=d;
		System.out.println("scoreArray["+c+"]값:"+scoreArray[c]);
		c++;
		d+=10;
		
	}
	
	
	
	}

}
