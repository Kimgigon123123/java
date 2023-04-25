package pack04.extend;

public class CellPhoneMain {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.powerOn();
		cp.powerOff();
		cp.bell();
		cp.sendVoice("누구세요");
		cp.receiveVoice("뚱이요");
		cp.hangUp();
	}
	
	
}
