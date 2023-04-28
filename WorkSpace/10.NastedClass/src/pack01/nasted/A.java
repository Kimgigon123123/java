package pack01.nasted;

public class A {
	int aField =10; //멤버중에 어떤것일까? : Main에서 aField를 출력해보기
	//인스턴스화 과정에서 사용되는 생성자 메소드는 별도로 구현하지 않으면 A(){}로 제공되고 있다(JVM 무시)
	public A() {System.out.println("A객체 생성됨");}

	//※내가 알고있는 모든것들은 필드(멤버)가 될수있다.※
	// B가 가지고있는 변수 bField와  , methodB를 Main.java(main 메소드)에서 사용해보기.
	public class B{ //
		 B() { System.out.println("B객체 생성됨");		}
		int bField = 10;
		
		void methodB() {
			System.out.println("메소드");
		}
	}
	
	
	static class C{
		 C() { System.out.println("C객체가 생성됨");		}
		 int fieldC;
		 void methodC() {
			 System.out.println("C메소드");
		 }
	}
	
	//A의 멤버 
	// 어떤 방법이든 상관없이 D의 멤버들을 출력하고 사용해보기
	public void methodD() {
		// A의 멤버일까? 아닐까?
		class D{
			D() { System.out.println("D가 생성됨"); }
			int fieldD ;
			void methodD() { 
				System.out.println("메소드 D");
			}
		}
		D d = new D();
		System.out.println(d.fieldD);
		d.methodD();
	}
	
	
	//↓? //지역변수, 로컬변수
	//메소드 내에서만 사용이 가능함.
	int methodA() {
		int data = 10;
		return data;
	}
	
	
}
