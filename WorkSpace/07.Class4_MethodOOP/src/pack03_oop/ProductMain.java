package pack03_oop;

public class ProductMain {
	public static void main(String[] args) {
		// 상품 두개를 생성하기.
		//1.컴퓨터 2.노트북
		//display()메소드 이용해서 내용 출력해보기
		
//		Product p1= new Product();
//		p1.num=1;
//		p1.name="컴퓨터";
//		p1.display();
//		
//		Product p2= new Product();
//		p2.num=2;
//		p2.name="노트북";
//		p2.display();
		
		ProductDTO com=new ProductDTO();
		com.num=1;
		com.name="컴퓨터";
		ProductDTO not=new ProductDTO();
		not.name="노트북";
		not.num=2;
		ProductDTO tv=new ProductDTO();
		tv.name="TV";
		tv.num=3;
		
		ProductDAO dao=new ProductDAO();
		dao.display(com);
		dao.display(not);
		dao.display(tv);
	}
}
