package dao.dto.method;

public class HumanMain {
	public static void main(String[] args) {
		HumanDTO human = new HumanDTO();
		HumanDAO dao = new HumanDAO();
		
		System.out.println(human.eye);
		System.out.println(human.ear);
		dao.coding(human);

		HumanDTO[]humanArr=new HumanDTO[5];//null,null,null,null,null
		for(int i = 0; i<humanArr.length;i++) {
			humanArr[i]=new HumanDTO();//Human클래스가 가진 모든 멤버가 메모리에 올라감(변수,메소드)
		
		}
		System.out.println(humanArr[0].ear);
	}
}
