package pack02_field;

public class Ex01_CarMain {//Main 붙었기 때문에 main메소드 만들기.
	public static void main(String[] args) {
		//Ex01_Car라는 클래스를 변수처럼 만들어보기. (사용가능하게)
		Ex01_Car myCar =new Ex01_Car();//인스턴스화: 객체(클래스)를 메모리에 올려서 사용하게 만드는것.
										//+내부에 있는 모든 멤버가 메모리에 올라가는것
		System.out.println("제조사: "+myCar.company);
		System.out.println("모델: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("속도: "+myCar.speed);
		
		
		System.out.println("사용자가 화면에 앞으로 가기를 눌렀다.!");
		myCar.speed=30;
		System.out.println(myCar.speed+"가 앞으로 달리기 시작");
		
		//내부에 있는 내용을 출력해보기
	}

}
