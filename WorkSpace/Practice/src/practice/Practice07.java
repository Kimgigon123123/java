package practice;

public class Practice07 {
	static void printSum(int from, int to) {
		int sum=0;
		for(int i=from;i<=to;i++) {
			sum+=i;
			
		}System.out.println(from+"에서 "+to+"까지의 합은 "+sum);
	
	}
	public static void main(String[] args) {
		printSum(1, 4);
	}

}
