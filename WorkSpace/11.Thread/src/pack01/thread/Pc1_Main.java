package pack01.thread;

public class Pc1_Main {
	public static void main(String[] args) {
		Pc1_Youtube pc1Y = new Pc1_Youtube();
		pc1Y.start();
		
		Pc1_Melon pc1M = new Pc1_Melon();
		pc1M.start();
		
	}
}
