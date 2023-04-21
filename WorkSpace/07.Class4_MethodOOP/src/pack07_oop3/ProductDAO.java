package pack07_oop3;

public class ProductDAO {
	void display(ProductDTO dto) {
		System.out.println("번호: "+dto.getNum());
		System.out.println("이름: "+dto.getName());
		System.out.println("가격: "+dto.getPrice()+"원");
		System.out.println("재고: "+dto.getCnt()+"개 남음");
	}
	
	void display(ProductDTO[]dtoArr) {
		for(int i=0;i<dtoArr.length;i++) {
			System.out.println(dtoArr[i].getNum());
		}
	}
}
