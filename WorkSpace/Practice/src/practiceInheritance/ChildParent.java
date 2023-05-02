package practiceInheritance;

public class ChildParent {

	public static void main(String[] args) {
		Parent pa = new Parent();
		pa.method1();
		pa.method2();
		
		
		
		Child ch = new Child();
		
		ch.method1();
		ch.method2();
		ch.method3();
		
		pa = ch;
		pa.method1();
		pa.method2();
		
		
		
		
	}
	
	
}
