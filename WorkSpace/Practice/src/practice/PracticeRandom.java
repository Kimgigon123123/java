package practice;

import java.util.Random;

public class PracticeRandom {
	public static void main(String[] args) {
		Random random = new Random();
		int num=random.nextInt(10)+1;
		
		System.out.println(num);
		
	}
}
