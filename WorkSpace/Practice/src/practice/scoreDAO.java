package practice;

public class scoreDAO {
	void display(scoreDTO[] scoArr) {
		for(int i=0;i<scoArr.length;i++) {
			System.out.println(scoArr[i].num+"번"+scoArr[i].name+"의 점수는 "+ scoArr[i].score);
		}
	}
	
	void display2(scoreDTO[] a, scoreDTO b) {
		System.out.println(b.name);
		System.out.println(a[0].name);
	}

}
