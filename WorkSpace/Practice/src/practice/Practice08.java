package practice;

public class Practice08 {

	static void stars(int num) {
		for(int i=0;i<num;i++) {
			System.out.print('*');
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			stars(i);
			System.out.println();
		}	
	} 
}
