package pack01_base;

public class Ex04_test {

	// 해당하는 Car클래스는 속성(변수) gas를 가진다. 
	//gas는 숫자형태로 속성이 관리가 된다. 
	//(1.Ex04_Car는 gas를 무조건 입력받아야지만 생성이 가능한 클래스이다.)
	// [isLeftGas라는 메소드를 구현해보기.
		// 해당하는 메소드는 true 또는 false의 결과만 리턴하는 메소드이다.]
		
		// true , false의 판단은 gas가 0인경우 false와 gas가 없습니다 라는 메세지가 콘솔에 출력이되고,
		// 그게 아니라면 true와 gas가 있습니다 라는 메세지가 콘솔에 출력이된다.
		
		
	// Ex04_CarMain을 만들고 모든 멤버에 접근해서 호출 및 사용 해보기 
	
	
	int gas;
	
	
	public Ex04_test(int gas) {
		super();
		this.gas = gas;
	}
	void isLifegas() {
		while(gas>0) {
			if(gas==0) {
				System.out.println("가스부족");
				
			}
			else {
				System.out.println("가스있음");
				gas--;
				System.out.println("남은 가스는"+gas);
			}
		}
		
	}


	public static void main(String[] args) {
		Ex04_test et= new Ex04_test(12);
		System.out.println(et.gas);
		System.out.println(et.isLifegas());
	}
	
	
}

