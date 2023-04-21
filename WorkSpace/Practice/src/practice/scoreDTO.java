package practice;

public class scoreDTO {
	String name;//학생이름
	int num;//학생번호
	int score;//점수
	
	public scoreDTO() {
		
	}
	
	public scoreDTO(String name, int num, int score) {
		super();
		this.name = name;
		this.num = num;
		this.score = score;
	}
}
