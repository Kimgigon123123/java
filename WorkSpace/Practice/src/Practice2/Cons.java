package Practice2;

public class Cons {
	
	
	int num=123; // 번호
	String name; // 이름
	int kScore; // 국어점수
	int eScore; //영어점수
	int mScore; // 수학점수
	int sum;
	int avg;
	
	Cons(){
		
	}
	
	public Cons(int num, String name, int kScore, int eScore, int mScore) {
		super();
		this.num = num;
		this.name = name;
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
		this.sum=kScore+eScore+mScore;
		this.avg=(this.sum/3);
	}
	
	
	public static void main(String[] args) {
		Cons kgg = new Cons(1, "김기곤", 100, 50, 30);
		System.out.println(kgg.num+"번 "+kgg.name);
		System.out.println("총점: "+kgg.sum);
		System.out.println("평균: "+kgg.avg);
		
		Cons kyg = new Cons(2,"권영균",20,40,60);
		System.out.println(kyg.num+"번 "+kyg.name);
		System.out.println("총점: "+kyg.sum);
		System.out.println("평균: "+kyg.avg);
		
		Cons c = new Cons();
		System.out.println(c.num);
	}
	
	
}
