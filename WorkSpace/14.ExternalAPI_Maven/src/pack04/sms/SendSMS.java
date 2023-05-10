package pack04.sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendSMS {
	public static void main(String[] args) {
		//깃허브 샘플 https://github.com/coolsms/coolsms-java-examples/
		// 깃허브 예제가 interface와 여러 class로 분리 해놔서 현재는 보기가 힘듬.
		
		final String APIKEY="NCSUAF6SYIJDTZKH";
		final String APISECRET="6VBOXW0YXO2CT1YULLXTIOXB1KW0P9AB";
		
		Message sms = new Message(APIKEY,APISECRET);
		
		HashMap<String, String> params= new HashMap<>();
		params.put("to", "01095113749");
		params.put("from", "01095113749");
		params.put("type", "SMS"); //SMS,LMS,MMS...
		params.put("text", "문자 자바로 보내기 테스트중");
		params.put("app_version", "JAVA SDK v1.2");
		
		try {
			JSONObject obj = sms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			
			e.printStackTrace();
		}
		
	}
}
