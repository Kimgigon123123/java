package practice;

public class scoreMain {
	public static void main(String[] args) {
	
	scoreDTO dto=new scoreDTO();
	scoreDAO dao=new scoreDAO();
	
	dto.name="홍씨";
	
	scoreDTO[] class1=new scoreDTO[3];
	class1[0]=new scoreDTO("김씨", 1, 50);
	class1[1]=new scoreDTO("박씨", 2, 70);
	class1[2]=new scoreDTO("이씨", 3, 100);
	
	scoreDTO[] class2= new scoreDTO[4];
	class2[0]=new scoreDTO("첫째", 1, 30);
	class2[1]=new scoreDTO("둘째", 2, 100);
	class2[2]=new scoreDTO("셋째", 3, 20);
	class2[3]=new scoreDTO("넷째", 4, 50);
	
	dao.display(class1);
	System.out.println("-------");
	dao.display(class2);
	dao.display2(class1, dto);
	
}
}
