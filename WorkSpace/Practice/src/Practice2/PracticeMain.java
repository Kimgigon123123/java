package Practice2;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeDTO[] dtoArr=new PracticeDTO[3];
		dtoArr[0]= new PracticeDTO(1,"권용균","남자",60);
		dtoArr[1]= new PracticeDTO(2,"김건호","남자",40);
		dtoArr[2]= new PracticeDTO(3,"김기곤","남자",80);
		
		PracticeDTO[] dtoArr2=new PracticeDTO[dtoArr.length+1];
		dtoArr2[dtoArr.length]=new PracticeDTO(4,"김수봉","남자",50);
		
		
		dtoArr2[0]= new PracticeDTO(1,"권용균","남자",60);
		dtoArr2[1]= new PracticeDTO(2,"김건호","남자",40);
		dtoArr2[2]= new PracticeDTO(3,"김기곤","남자",80);
		
		
		System.out.println(dtoArr2[3].getName());
	}
}
