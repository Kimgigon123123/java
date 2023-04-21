package pack02_trycatch;

public class Ex04_TryNewCatch {
	public static void main(String[] args) {
		//1부터 100까지의 누적합(sum)을 구하시오.
		//단, 누적합이 777 이상이 되면 계산을 중지하고 결과를 출력해주세요.
		
		int sum=0;
		//throw: 강제로 예외를 발생시켜 catch블럭을 실행시킨다.(throw 던지다,넘기다)
		try {
		for(int a=1;a<=100;a++) {
			sum=sum+a;
			if(sum>=777) {
				throw new Exception("누적합이 777이상이 되었다!!!"+sum);
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		System.out.println(sum);
		
	}

}
