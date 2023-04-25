package Practice2;

public class PracticeDTO {
	private int num; // 번호
	private String name;// 이름
	private String gender; // 성별
	private int score ; // 점수
	
	
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public PracticeDTO(int getNum, String getName, String getGender, int getScore) {
		super();
		this.num = getNum;
		this.name = getName;
		this.gender = getGender;
		this.score = getScore;
	}
	public PracticeDTO() {
		super();
	}
	
	
	
	
	
	
}
