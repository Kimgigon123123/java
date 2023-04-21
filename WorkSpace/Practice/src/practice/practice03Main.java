package practice;

import java.util.Scanner;

public class practice03Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("제육볶음 맛은?");
		String taste = sc.nextLine();
		practice03 aa = new practice03("제육볶음", "3000원",taste);
		System.out.println(aa.name);
		System.out.println(aa.price);
		
		System.out.println(aa.taste);
	
}
}
