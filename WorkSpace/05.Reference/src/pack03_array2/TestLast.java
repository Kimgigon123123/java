package pack03_array2;

import java.awt.geom.Area;
import java.util.Arrays;

public class TestLast {
	public static void main(String[] args) {
		//2차원 배열을 만듬.
		//2차원 배열의 크기와 타입은 자유롭게 하면됨.
		//2차원 배열에 구구단 2~9단의 답을 저장하고 2차원 배열을 통해 출력까지 해보기
		//for문을 이용
		
		int[][]array=new int[8][9];
		System.out.println(array[0][0]);
//		array[0(2)][0(1)]=2*1;
//		array[0(2)][1(2)]=2*2;
//		array[0(2)][2(3)]=2*3;
		
		int[]array1=new int[8];
		for(int a1=0;a1<8;a1++) {
			array1[a1]=a1+2;
			System.out.println(array1[a1]+"단");
//			System.out.println(array1[a1]);
			for(int a2=0;a2<9;a2++) {
				array[a1][a2]=((a1+2)*(a2+1));
				System.out.print(array[a1][a2]+" ");
			}System.out.println();
			
		}
		
		//1차원 배열이 2개가 있음.
		//arrA={1,2,3,4}
		//arrB={4,5,6,8}
		//arrA에 들어있는 내용과 arrB에 들어있는 내용을 바꾸세요
		//변경후 arrA{4,5,6,8} arrB{1,2,3,4}
		
		
		int[]arrA= {1,2,3,4};
		int[]arrB= {4,5,6,8};
		int[]arrC= new int[4];
		int[]arrD= new int[4];
		arrC=arrA;
		arrD=arrB;
		arrB=arrC;
		arrA=arrD;
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		
		
		
		
		//심화) int[] arr = {3,4,6,7,8,9,1,2,5}
		//해당 내용을 오름차순 또는 내림차순으로 정렬
		
//		int[] arrSort = { 3 , 4 , 6 , 7 , 8 , 9 , 1 , 2 , 5 };
//		for(int i = 0 ; i < arrSort.length; i ++) {
//			for(int j = i+1; j < arrSort.length; j++) {
//				if(arrSort[i] > arrSort[j]) {//arrSort[i]3 > arrSort[j]1
//					int temp = arrSort[i];//3
//					arrSort[i] = arrSort[j];
//					arrSort[j] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(arrSort));
	
//		arr[0]이 arr[1]보다 작으면 arr[2]로;
//		arr[0]이 arr[2]보다 작으면 arr[3]으로;
//		arr[0]이 arr[3]보다 작으면 arr[4]로;
//		arr[0]이 arr[x]보다 작으면 arr[x+1]로;
//		arr[0]이 arr[x]보다 커지면;
//		arr[0]과 arr[x]의 위치를 바꿈;
//		arr[y]   arr[x]   y++;
//		
//		arr[1]이 arr[2]보다 작으면 arr[3]으로;
// 		arr[1]이 arr[3]보다 작으면 arr[4]로;
		
		int[] newarr={0};
		int[]arr= {4,2,1,3,5};
		for(int a=0;a<arr.length;a++) {
			for(int b=1+a;b<arr.length;b++) {
				if(arr[a]>arr[b]) {
					newarr[0]=arr[a];
					arr[a]=arr[b];
					arr[b]=newarr[0];
					
				}
			}
		}System.out.println(Arrays.toString(arr));
		
		
		
	}

}

