package practice;

public class Practice10 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			//outChars(' ',10-i);
			for(int j=0;j<10-i;j++) {
				System.out.print(' ');
			}
			for(int j=0;j<i;j++) {
				System.out.print('☆');
			}
			//outChars('☆',i);
			System.out.println();
		}
	}
	
	static void outChars(char ch,int num) {
		for(int i=0;i<num;i++) {
			System.out.print(ch);
		}
	}
} 


