package pack04_oop2;

public class StudentMain {
	public static void main(String[] args) {
		//private<>public
		
		StudentDTO dto1= new StudentDTO(1,"김",100,100,10);
		StudentDTO dto2= new StudentDTO(2, "박", 20, 50, 20);
		
		StudentDAO dao=new StudentDAO();
		dao.display(dto1);
		dao.display(dto2);
		System.out.println("=========");
		dao.display(dto1);


		
		
		//DTO 상태정보
		//DAO 기능
		

		
	}
}
