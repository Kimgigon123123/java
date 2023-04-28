package pack01_base;

public class Ex07_OverLoading {
	// 메소드 오버로딩: 메소드의 '이름이 같고 타입과 파라메터의 개수'를 다르게 해서 선택해서 사용할수 있게 한것
	void method() {
		System.out.println("ㅎㅇ");
	}
	void method(int param1) {
		System.out.println(param1);
	}
	void method (String param1, int param2) {
		System.out.println(param1+param2);
	}
	
	
	public static void main(String[] args) {
		Ex07_OverLoading eo= new Ex07_OverLoading();
		//대표적으로 메소드 오버로딩이 되어있는 것은 println임
		//어떤 타입을 넣어도 일단 출력이 되게끔 만들어뒀음
		eo.method("안녕",10);
		eo.method();
		eo.method(123);
	}
}
