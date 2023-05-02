package practiceNastedClass;

public class pc3Main {
	public static void main(String[] args) {
		pc3 p3 = new pc3();
		
		pc3.A a = p3.new A();
		a.methodA();
		
		pc3.A.B b = a.new B();
		b.methodB();
		
		pc3.C c = new pc3.C();
		c.methodC();
		
		p3.methodD();
		
		pc3.A.E e = a.new E();
		e.methodE();
		
		pc3.C.F f = c.new F();
		f.methodF();
		
		
	}
}
