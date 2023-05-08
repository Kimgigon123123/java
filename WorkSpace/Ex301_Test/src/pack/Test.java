package pack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		//1번
		
		int[] Arr = new int[5];
		
		
		for(int i=0; i<5; i++) {
			Arr[i]=i+1;
			System.out.println("배열["+i+"] 값 : 이름"+Arr[i]);
		}
		
		
		
		
		
		//2번
		
		
		Scanner sc = new Scanner(System.in);
		int inputData = Integer.parseInt(sc.nextLine());
		
		int[] Arr2 = new int[inputData+1];
		
		int i = 0;
		
		while(i<inputData+1) {
			Arr2[i]=i+1;
			System.out.println("배열["+i+"] 값 : "+Arr2[i]);
			i++;
		}
		
		
		
		
		
		//3번
		
		
		int[] Arr3 = {1,3,5,7,9,11,13,15,17,19,21};
		
		int sum=0;
		
		for(int i2=0;i2<Arr3.length;i2++) {
			
			sum=sum+Arr3[i2];
			
		}
		System.out.println("누적합"+sum);
		
		
		
		
		
		
		
		
		//4번
		
		
		int[] Arr4 = {10,5,20,30,1};
		
		int max = Arr4[0];
		int min = Arr4[0];
		
		for(int i3=0;i3<Arr4.length;i3++) {
			for(int j=0;j<Arr4.length;j++) {
				if(Arr4[i3]>Arr4[j]&&Arr4[i3]>max) {
					max=Arr4[i3];
				}
				else if(Arr4[i3]<Arr4[j]&&Arr4[i3]<min) {
					min=Arr4[i3];
				}
			}
		}
		System.out.println("최대값: "+max);
		System.out.println("최솟값: "+min);
		
		
	}
	
	
	
	
	
	
	
	
}
