package pack01_base;

public class EX01_car {
	//클래스의 중괄호 사이 (블럭킹 내부)에 있는 모든것들은 해당하는 이름의 클래스 멤버이다.
	//자동차의 속력 , 최대속력 , 색상 , 제조사 등의 속성은 필드(변수)로 관리를 하고,
	//자동차가 달리거나 멈추거나 하는 기능의 관리는 메소드로 한다.
	int speed ; //자동차의 속력  ( 기본값 0 )
	
	
	
	public EX01_car(int speed) {
		super();
		this.speed = speed;
	}

	//멤버의 구분 : 크게 2가지 
	//① 인스턴스 멤버 ( IM,Iv(인스턴스변수),im(인서턴스메소드)..등등) :※ new ※
	// 인스턴스화 과정을 거쳐야만 사용이 가능하다. ( 인스턴스화 과정 후 메모리에 올라가기때문)=>new Class();
	// 인스턴스 멤버끼리는 언제든지 접근이 가능하다. 
	
	//②스태틱 멤버 ( SM , sv , sm 등 ) :※ static※
	//메모리에 별도에 인스턴스화 과정없이 올라가기때문에 언제든지 사용이 가능함.
	//단, ※ 메모리에 항상 먼저 올라가야하기때문에 인스턴스 멤버에 바로 접근이 불가능함=>인스턴스화 과정후 사용가능
	void run() {
		System.out.println(speed + " 로 달린다.");
	}
	
	public static void main(String[] args) {
		EX01_car car = new EX01_car(33);
		car.run();
	}
	
	
}
