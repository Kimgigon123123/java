package practiceNastedClass;

import practiceNastedClass.practice1.AA;
import practiceNastedClass.practice1.AA.AAB;
import practiceNastedClass.practice1.AA.BB;
import practiceNastedClass.practice1.AA.BB.CC;
import practiceNastedClass.practice1.AA.BB.CC.DD;

public class Practice1Main {
	public static void main(String[] args) {
		
		AA aa = new AA();
		AA.AAB aab = new AAB();
		aab.methodAAB();
		AA.BB bb = aa.new BB();
		bb.methodAAB();
		AA.BB.CC cc = bb.new CC();
		cc.methodAAB();
		AA.BB.CC.DD dd = cc.new DD();
		System.out.println(dd.a);
		
//		AA aa = new AA();
//		AAB aab = new AAB();
//		aab.methodAAB();
//		BB bb = aa.new BB();
//		bb.methodAAB();
//		CC cc = bb.new CC();
//		cc.methodAAB();
//		DD dd = cc.new DD();
	}
	
}
