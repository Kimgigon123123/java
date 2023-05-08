package pack;

public class Test05Kgg {
	public static void main(String[] args) {
		
		Test05Kgg Printer = new Test05Kgg();
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		
		
		
	}
	
	
	
	
	void println(int iData) {
		System.out.println(iData);
	}
	
	void println(boolean bData) {
		System.out.println(bData);
	}
	
	void println(double dData) {
		System.out.println(dData);
	}
	
	void println(String sData) {
		System.out.println(sData);
	}
	
	
	
}
