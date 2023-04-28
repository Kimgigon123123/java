package practiceNastedClass;

public class pc1 {

	public class A {
		void methodA() {
			System.out.println("A");
		}

		public class B {
			void methodB() {
				System.out.println("B");
			}
		}
	}

	static class C {
		void methodC() {
			System.out.println("C");
		}
	}
	
	void methodD() {
		class D {
			void methodD() {
				System.out.println("D");
			}
			
		}
		D d = new D();
		d.methodD();
	}

}
