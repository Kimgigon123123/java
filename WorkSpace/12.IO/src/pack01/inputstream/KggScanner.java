package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KggScanner {
	//BufferReader를 사용해서 스캐너와 비슷한 구조를 만들어보기.
	//Scanner sc = new Scanner(System.in);
	//private InputStream in;
	private BufferedReader br;
	public KggScanner(InputStream in) {
		//this.in = in;
		br=new BufferedReader(new InputStreamReader(in));
	}
	
	
	public String nextLine(){
		String inputData;
		try {
			inputData=br.readLine();
			return inputData;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	//기존스캐너 nextInt는 숫자 외에 값을 입력하면
	//오류가 발생했음. 우리가 만들 nextInt는
	//숫자 외에 값이 입력되면 -1 을 return하는 메소드를 만드세요
	
	public int nextInt() {
		
		int inputInt=-1;
		try {
			inputInt=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();//오류 출력이 필요할시
		}
		return inputInt;
	}
}
