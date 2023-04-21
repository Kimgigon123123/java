package pack04_oop2;

public class StudentDTO {
	//메소드나 변수 앞에 접근 제한자라는것을 사용하면, 외부에서 접근을 제한할 수 있따.
	//public,protected,default,private
	//지금 사용할것:public(공공,공개된),private(공개되지않은,사적인)
	//public:같은 프로젝트 내 에서 접근 가능
	//default: 같은 패키지 내에서 접근 가능
	//private: 같은 클래스 내부에서만 접근 가능
	
	private int num;
	
	//외부에서 score1을 변수에 접근해서 변경한 경우 데이터의 신뢰가 없어짐(정합성)
	
	
	
	//getter & setter
	//변수이름앞에 get을 붙이고 뒤에 변수이름 첫번째 글자를 대문자로 바꾼형태로
	//외부에서의 접근이 막혀있는 변수를 메소드를 통해서 접근 가능하게 만드는 구조
	//score1==>getScore1()메소드 ==> score1에 들어있는 값을 리턴해줌
	//         getScore1(int score1) ==> score1에 값을 변경해줌
	private String name;
	private int korSco;
	private int matSco;
	private int engSco;
	private int sum;
	double avg;
	
	
	
	


	public int getNum() {
		return num;
	}






	public void setNum(int num) {
		this.num = num;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getKorSco() {
		return korSco;
	}






	public void setKorSco(int korSco) {
		this.korSco = korSco;
	}






	public int getMatSco() {
		return matSco;
	}






	public void setMatSco(int matSco) {
		this.matSco = matSco;
	}






	public int getEngSco() {
		return engSco;
	}






	public void setEngSco(int engSco) {
		this.engSco = engSco;
	}






	public int getSum() {
		return sum;
	}






	public void setSum(int sum) {
		this.sum = sum;
	}






	public double getAvg() {
		return avg;
	}






	public void setAvg(double avg) {
		this.avg = avg;
	}






	public StudentDTO(int num, String name, int korSco, int matSco, int engSco) {
		
		this.num = num;
		this.name = name;
		this.korSco = korSco;
		this.matSco = matSco;
		this.engSco = engSco;
		this.sum=this.korSco+this.matSco+this.engSco;
		this.avg=(double)(this.korSco+this.matSco+this.engSco)/3;
	}
}
