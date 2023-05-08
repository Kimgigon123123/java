package pack;

import java.util.Random;

public class Test03Arr2 {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		
		String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] iStr= {"0","1","2","3","4","5","6","7","8","9"};
		
		String[] Arr = new String [4];
		Arr[0]= Integer.toString(ran.nextInt(10));
		Arr[1]= Integer.toString(ran.nextInt(10));
		Arr[2]= Integer.toString(ran.nextInt(10));
		Arr[3]= Integer.toString(ran.nextInt(10));
		
		
		
		for(int i=0;i<ran.nextInt(5);i++) {
			int place=ran.nextInt(4);
			Arr[place]=str[ran.nextInt(10)];
		}
		System.out.print(Arr[0]+Arr[1]+Arr[2]+Arr[3]);
		System.out.println(" 뽑았습니다");
		
		System.out.println("\n전환합니다");
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<10;j++) {
				if(Arr[i]==str[j]) {
					Arr[i]=iStr[j];
				}
			}
		}
		
		System.out.println(Arr[0]+Arr[1]+Arr[2]+Arr[3]);
		
//		if(Arr[0]==str[0]) {
//			Arr[0]=iStr[0];
//		}
	}
	
	
}
