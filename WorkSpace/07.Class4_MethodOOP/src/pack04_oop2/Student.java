package pack04_oop2;


//Student Class: 학생의 성적 정보를 관리할수 있게 만든 설계도
public class Student {
	//멤버(필드): 학생의 번호, 이름. 국어성적, 수학성적, 영어성적,총점,평균
	//필드부를 직접 구현하고 StudentMain에서 Student객체를 생성하고 내용을 할당하고 출력해보기
	int num;
	String name;
	int korSco;
	int matSco;
	int engSco;
	int sum;
	double avg;
	public Student(int num, String name, int korSco, int matSco, int engSco) {
		super();
		this.num = num;
		this.name = name;
		this.korSco = korSco;
		this.matSco = matSco;
		this.engSco = engSco;
		this.sum=this.korSco+this.matSco+this.engSco;
		this.avg=(double)(this.korSco+this.matSco+this.engSco)/3;
	}
	
	
	
	//DTO와 DAO로 나눠서 main에서 똑같은 동작되게 처리해보기
	void display(Student st1){
		System.out.println(num+name+sum+avg);
	}
	
	
}
