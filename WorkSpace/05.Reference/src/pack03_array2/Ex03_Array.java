package pack03_array2;

public class Ex03_Array {
	//2차원 배열을 두가지 방법으로 두개 만들어보기.
	//1. 2차원 배열을 초기화 할 때 행과열의 크기를 주고 만들기
	//2. 2차원 배열을 초기화 할 때 값이 있는 1차원 배열을 바로 넣고 만들기
	
	public static void main(String[] args) {
		
		
		int[][]array1=new int[2][3]; //1번
		System.out.println(array1[0][0]);
		int[]arr = new int[3];
		int[][]array2 = {arr,{7,8,9}}; //2번
		
		
		
		//3번 방식: 2차원 배열은 1차원 배열을 요소로 가진다. (== 1차원배열을 여러개 그룹화해놓은것)
		//1차원 배열의 개수만 정확하게 주어졌을 때 쓸 수 있는 방법.
		int[][]array3=new int[5][];
		array3[0]=new int[3];//int[] arr = {1,2}; << 중괄호 초기화식은 최초 한번만 가능함
		System.out.println(array3[0].length);
		
		
		
		
	}
	
	
	
	
	
}
