package pack02_static;

public class Test01_Method {
	boolean login(String id, String pw) {
		if("master".equals(id)&&"master1234".equals(pw)) {
			return true;
		}
		else {
			return false;
		}
	}
}
