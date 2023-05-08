package pack;

import java.util.Random;

public class Test03Arr1 {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		
//		int[] Arr= new int[8];
//		Arr[0]=ran.nextInt(10);
//		Arr[1]=ran.nextInt(10);
//		while(Arr[1]==Arr[0]) {
//			ran.nextInt(10);
//		}
//		Arr[2]=ran.nextInt(10);
//		while(Arr[2]==Arr[0]||Arr[2]==Arr[1]) {
//			ran.nextInt(10);
//		}
		
		int[]numbers= {0,1,2,3,4,5,6,7,8,9};
		
		int[]Arr=new int[8];
		
		for(int i = 0;i<8;i++) {
			Arr[i]=ran.nextInt(10);
			for(int j=0;j<i;j++) {
				if(Arr[i]==Arr[j]) {
					i=0;
					j=0;
					continue;
				}
			}
		}
		
		for(int i=0;i<8;i++) {
			System.out.println(Arr[i]);
		}
		
		int count=0;
		int result=0;
		for(int i=0; i<10; i++) {
			for(int j=0; j<8; j++) {
				if(numbers[i]!=Arr[j]) {
					count=count+1;
					if(count==8) {
						System.out.println("없는숫자는 "+i);
						result=result+i;
					}
				}
			}
			count=0;
		}
		System.out.println("결과 : "+result);
		
		
		
	}
	
	
}
