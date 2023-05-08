package pack;

public class Test05TestClass {

	
	public static void main(String[] args) {
		
		Test05TestClass tClass = new Test05TestClass();
		A a = tClass.new A("필드");
		B b = tClass.new B(1,2);
		
		
		
	}
	
	
	public class A {
		String A;

		public A(String a) {
			
			System.out.println(a);
		}
		
	}
	
	
	public class B {
		int one;
		int two;
		
		
		public B(int one, int two) {
			
			System.out.println(one);
			System.out.println(two);
		}
		
		
	}
	
		
	
		
	
}
