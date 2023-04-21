package pack06_game;

import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);



		    int kor, eng, mat;

		    int sum = 0;

		    double avg;



		    while (true) {

		      System.out.print("국어 성적을 입력하세요: ");

		      kor = sc.nextInt();



		      if (kor < 0 || kor > 100) {

		        System.out.println("잘못된 입력입니다. 0부터 100까지의 숫자를 입력해 주세요.");

		        continue;

		      }



		      System.out.print("영어 성적을 입력하세요: ");

		      eng = sc.nextInt();



		      if (eng < 0 || eng > 100) {

		        System.out.println("잘못된 입력입니다. 0부터 100까지의 숫자를 입력해 주세요.");

		        continue;

		      }



		      System.out.print("수학 성적을 입력하세요: ");

		      mat = sc.nextInt();



		      if (mat < 0 || mat > 100) {

		        System.out.println("잘못된 입력입니다. 0부터 100까지의 숫자를 입력해 주세요.");

		        continue;

		      }



		      sum = kor + eng + mat;

		      avg = (double)sum / 3;



		      break;

		    }



		    System.out.println("총합: " + sum);

		    System.out.println("평균: " + avg);
	}

}
