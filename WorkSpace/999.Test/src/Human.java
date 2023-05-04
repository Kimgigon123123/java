
public class Human {
	// 접근 제한자 
	public String ask; //같은반 내부
	String look; //같은조 옆에서 지켜보기
	private String river; //간(나만)  
	
	public String getRiver(boolean isDoctor) {
		if(isDoctor) {
			return this.river;
		}else {
			return "당신은 의사가 아니기때문에 접근이불가능합니다";
		}
		
		
	}
	
	public void setRiver(String river) {
		if(river.equals("싱싱한 간")) {
			this.river=river;
		}else {
			System.out.println("바꿀수 없음");
		}
	}
}
