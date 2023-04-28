package practiceNastedClass;

import practiceNastedClass.pc2.A;
import practiceNastedClass.pc2.A.B.D;
import practiceNastedClass.pc2.A.E;

public class pc2Main {
	public static void main(String[] args) {
		pc2 pc2 = new pc2();
		
		A a = new A();
		a.methodA();
		A.B b = new A.B();
		b.methodB();
		A.B.C c = b.new C();
		c.methodC();
		A.B.D d = new D();
		d.methodD();
		A.E e = a.new E();
		e.methodE();
		a.methodF();
		
	}
}
