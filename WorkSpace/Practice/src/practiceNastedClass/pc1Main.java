package practiceNastedClass;

public class pc1Main {
	public static void main(String[] args) {
		pc1 pc1= new pc1();
		pc1.A a = pc1.new A();
		a.methodA();
		pc1.A.B b = a.new B();
		b.methodB();
		pc1.C c = new pc1.C();
		c.methodC();
		pc1.methodD();
	}
}
