package Practice2;

public class DAOall {
	
	
	
	class DTO1{
		int num1=1;
	}
	
	class DTO2{
		int num2=2;
	}
	
	class DTO3{
		int num3=3;
	}
	
	class DAO1{
		void dao1(DTO1 a) {
			System.out.println("저는 "+a.num1+"번입니다");
		}
	}
	
	
	
	class DAO2{
		void dao2(DTO2 b) {
			System.out.println("저는 "+b.num2+"번입니다");
		}
	}
	
	
	class DAO3{
		void dao3(DTO3 c) {
			System.out.println("저는 "+c.num3+"번입니다");
		}
	}
	
	
	

	public static void main(String[] args) {
		DAOall da = new DAOall();
		
		DTO1 dto1 = da.new DTO1();
		DTO2 dto2 = da.new DTO2();
		DTO3 dto3 = da.new DTO3();
		
		DAO1 dao1 = da.new DAO1();
		dao1.dao1(dto1);
		
		DAO2 dao2 = da.new DAO2();
		dao2.dao2(dto2);
		
		DAO3 dao3 = da.new DAO3();
		dao3.dao3(dto3);
	}
	
	
}




