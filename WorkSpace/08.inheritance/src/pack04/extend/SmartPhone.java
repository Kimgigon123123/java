package pack04.extend;

public class SmartPhone extends DmbPhone{
	int internet; // <== SmartPhon 생성시 입력 받아 생성하게 생성자 메소드를 만들고 싶음
	//DmbPhone dmd = new DmbPhone(param....)
	
	//Override : 재정의 1. 부모 클래스의 기능을 그대로 두고 기능을 새로 추가하는 방식
	
	@Override
	void powerOn(){
		System.out.println("삼성의 로고가 3D 움직이면서 로딩");
		super.powerOn();
	}
	@Override
	void powerOff() {
		System.out.println("0.5초 내에 전원이 꺼짐");
	}
	
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model);//부모 클래스가 별도의 생성자 메소드를 가지고 있다면
										// 해당하는 부모 클래스가 인스턴스화 되어야지만, 자식 객체도 생성이 가능하다.
		this.internet= internet;
	}

	void internetOn() {
		System.out.println("인터넷기능을 실행합니다.");
	}
}
