package practice;

public class practice05 {
	//메인에서 배열을 메소드에게 넘김.
	//메소드는 배열의 누적합을 구해서 그 결과를 다시 메인에게 줌
	int sum1(int[]arasd) {
		int sum =0 ;
		for (int i = 0; i < arasd.length; i++) {
			sum += arasd[i];
		}
		return sum;
	}
	


}
