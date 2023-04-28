package pack.lotto;

import java.util.Random;

public class lottoPercent {
	public static void main(String[] args) {
		Random random = new Random();
		
		int count = 0;
		int total=0;
		
		while(count==6) {
			
			int[] arr1 = new int[6];
			for(int i=0; i<6; i++ ) {
				arr1[i]=random.nextInt(45)+1;
				for(int j=0; j<i; j++) {
					if(arr1[i]==arr1[j]) {
						i=0;
						continue;
					}
					
				}
			}
			
			int[] arr2 = new int[6];
			for(int i=0; i<6; i++) {
				arr2[i]=random.nextInt(45)+1;
				for(int j=0; j<i; j++) {
					if(arr2[i]==arr2[j]) {
						i=0;
						continue;
					}
				}
			}
			
			
			for(int i=0; i<6;i++) {
				for(int j=0; j<6; j++) {
					if(arr1[i]==arr2[j]) {
						count=count+1;
					}
				}
			}
			
			total=total+1;
			
		}
		
		
		
		
		
	
		
	}
}
