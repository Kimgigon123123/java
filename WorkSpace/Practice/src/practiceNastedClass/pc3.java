package practiceNastedClass;

public class pc3 {
	class A{
		void methodA(){
			System.out.println("A");
		}
		class B{
			void methodB() {
				System.out.println("B");
			}
		}
		 class E{
			void methodE() {
				System.out.println("E");
			}
		}
	}
	static class C{
		void methodC() {
			System.out.println("C");
		}
		class F{
			void methodF() {
				System.out.println("F");
			}
		}
	}
	void methodD(){
		class D{
			void methodD() {
				System.out.println("D");
			}
			class G{
				void methodG() {
					System.out.println("G");
				}
			}
		}
		D d = new D();
		d.methodD();
		D.G g = d.new G();
		g.methodG();
		
	}
}
