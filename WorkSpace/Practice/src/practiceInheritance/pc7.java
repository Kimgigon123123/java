package practiceInheritance;

	class A{int num1=1;}
	
	class B extends A{int num2=2;}
	class C extends A{int num3=3;}
	
	class D extends B{int num4=4;}
	class E extends C{int num5=5;}
	

public class pc7 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		System.out.println(b.num1);
		System.out.println(b.num2);
		System.out.println(d.num1);
		System.out.println(d.num2);
		System.out.println(d.num4);
		
		b.num1=100;
		System.out.println(a.num1);
		System.out.println(b.num1);
		
	}
}
