package practiceNastedClass;

public class pc2 {
	
	
	static class A{
		
		
		static void methodA() {
			System.out.println("A");
		}
		static class B{
			void methodB() {
				System.out.println("B");
			}
			public class C{
				void methodC() {
					System.out.println("C");
				}
			}
			static class D{
				void methodD() {
					System.out.println("D");
				}
			}
			
		}
		public class E{
			void methodE() {
				System.out.println("E");
			}
		}
		void methodF() {
			class F{
				void methodF() {
					System.out.println("F");
				}		
			}
			F f = new F();
			f.methodF();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
