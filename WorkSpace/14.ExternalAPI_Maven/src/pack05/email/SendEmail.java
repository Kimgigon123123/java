package pack05.email;

import java.net.URL;
import java.util.Scanner;

import javax.mail.Multipart;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail se = new SendEmail();
//		se.sendSimple();
		
//		se.sendMulti();
		
		se.sendHtml();
		
	}
	// 1. 단순하게 텍스트만 있는 이메일 : SimpleEmail
	// 2. 첨부파일이나 url등으로 이미지가 있는 이메일 : MultiPartEmail
	// 3. 모든 기능을 가지고 html 태그까지 사용가능한 : HtmlEmail
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		//smtp.naver.com
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고 있는 과정인지.
		
		mail.setAuthentication("kgg990321", "비밀번호");
		mail.setSSLOnConnect(true);
		//============= 고정 어떤메일을 쓰든 smtp서버와 smtp서버를 이용할수있는 고객인증
		
		//송신인
		try {
			mail.setFrom("kgg990321@naver.com","한울KGG");
			
			mail.addTo("kgg990321@naver.com","한울KGGTO");//여러개하면 여러명한테 전송
			
			mail.setSubject("회원가입 축하메세지");
			mail.setMsg("내용입니다~");
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침. ↑
			
			mail.send();
			
		} catch (EmailException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
	}
	
	
	public void sendMulti() {
		MultiPartEmail mail = new MultiPartEmail();
		//smtp.naver.com
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고 있는 과정인지.
		
		mail.setAuthentication("kgg990321", "비밀번호");
		mail.setSSLOnConnect(true);
		//============= 고정 어떤메일을 쓰든 smtp서버와 smtp서버를 이용할수있는 고객인증
		
		//송신인
		try {
			mail.setFrom("kgg990321@naver.com","한울KGGFROM");
			
			mail.addTo("kgg990321@naver.com","한울KGGTO");//여러개하면 여러명한테 전송
			mail.addTo("youngmoon525@naver.com","한울KGGTO");//여러개하면 여러명한테 전송
			
			mail.setSubject("회원가입 축하메세지");
//			Scanner sc = new Scanner(System.in);
//			String msg = sc.nextLine();
//			mail.setMsg(msg);
			mail.setMsg("내용입니다~");
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\study-java\\WorkSpace\\12.IO_FileTest\\pic.jpg");
			//이미지 파일 경로를 넣어줌.(경로를 찾을 수 없습니다 오류나오면 주석할꺼임)
			mail.attach(file);//메일에 파일추가
			
			file = new EmailAttachment();
			file.setURL(new URL("https://www.digimonmasters.com/images/header/visual_bg_dig02.png"));
			mail.attach(file);
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침. ↑
			
			mail.send();
			
		} catch (EmailException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
	}
	
	
	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
		//smtp.naver.com
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고 있는 과정인지.
		
		mail.setAuthentication("kgg990321", "Kjh6877h!!");
		mail.setSSLOnConnect(true);
		//============= 고정 어떤메일을 쓰든 smtp서버와 smtp서버를 이용할수있는 고객인증
		
		//송신인
		try {
			mail.setFrom("kgg990321@naver.com","한울KGGFROM");
			
			mail.addTo("kgg990321@naver.com","한울KGGTO");//여러개하면 여러명한테 전송
			mail.addTo("youngmoon525@naver.com","한울KGGTO");//여러개하면 여러명한테 전송
			
			mail.setSubject("회원가입 축하메세지");

			
			//메일의 내용이 일반 글자가 아니라 html형태로 보낼꺼이기 때문에 바꿈.
			StringBuffer msg = new StringBuffer(); //"A","A"+"B"
			msg.append("<html>");//
			msg.append("<body>");
			//html String으로 만들기 경연대회
			msg.append("<header>\r\n"
					+ "        <img src=\"image/logo.png\" alt=\"아이즈원 로고 왼쪽 상단\">\r\n"
					+ "        <p>Profile</p>\r\n"
					+ "    </header>\r\n"
					+ "    <div class=\"wrap\">\r\n"
					+ "        <div class=\"box\">\r\n"
					+ "            <div class=\"box1\">\r\n"
					+ "                <img src=\"https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzAzMDNfNTEg%2FMDAxNjc3ODUxNDMyMzI3.IG2LGufzYsJj-We9Zu8-pRUmhy7G5RRr7SAdBbKf5wsg.LBQBqDH6byyJ27qozHn3_ETnbLtCFavzD3DemC5l8Xkg.JPEG.mssixx%2FIMG_6929.JPG&type=a340\" alt=\"장원영\">\r\n"
					+ "                <div class=\"text1\">\r\n"
					+ "                    <ul>\r\n"
					+ "                        <li style=\"font-size: 20px; margin: 30px;\"><a href=\"https://namu.wiki/w/%EC%9E%A5%EC%9B%90%EC%98%81\" target=\"_blank\">장원영</a></li>\r\n"
					+ "                        <li style=\"font-size: 45px; margin:20px; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\">JANG WON YOUNG</li>\r\n"
					+ "                            <div class=\"subText1\">\r\n"
					+ "                                <li>생일 2004년 8월 31일</li>\r\n"
					+ "                                <li>혈액형 O형</li>\r\n"
					+ "                                <li>키 169cm</li>\r\n"
					+ "                                <li>취미 언니들하고 놀기</li>\r\n"
					+ "                                <li>특기 영어발음</li>\r\n"
					+ "                            </div>\r\n"
					+ "                    </ul>\r\n"
					+ "                </div>\r\n"
					+ "            </div>\r\n"
					+ "        </div>\r\n"
					+ "        <div box>\r\n"
					+ "            <div class=\"box2\">\r\n"
					+ "                <img src=\"https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F5400%2F2022%2F10%2F08%2F0000207292_001_20221008225008668.jpg&type=a340\" alt=\"사쿠라\">\r\n"
					+ "                <div class=\"text2\">\r\n"
					+ "                    <ul>\r\n"
					+ "                        <li style=\"font-size: 20px; margin: 30px;\"><a href=\"https://namu.wiki/w/%EB%AF%B8%EC%95%BC%EC%99%80%ED%82%A4%20%EC%82%AC%EC%BF%A0%EB%9D%BC\" target=\"_blank\">미야와키 사쿠라</a></li>\r\n"
					+ "                        <li style=\"font-size: 45px; margin:20px; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\">MIYAWAKI SAKURA</li>\r\n"
					+ "                            <div class=\"subText2\">\r\n"
					+ "                                <li>생일 1998년 3월19일</li>\r\n"
					+ "                                <li>혈액형 A형</li>\r\n"
					+ "                                <li>키 163cm</li>\r\n"
					+ "                                <li>취미 게임</li>\r\n"
					+ "                                <li>특기 재미있는 그림 그리기</li>\r\n"
					+ "                            </div>\r\n"
					+ "                    </ul>\r\n"
					+ "                </div>\r\n"
					+ "            </div>\r\n"
					+ "        </div>\r\n"
					+ "        <div box>\r\n"
					+ "            <div class=\"box3\">\r\n"
					+ "                <img src=\"https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F5353%2F2022%2F10%2F25%2F0000851013_001_20221025130004692.jpg&type=a340\" alt=\"조유리\">\r\n"
					+ "                <div class=\"text3\">\r\n"
					+ "                    <ul>\r\n"
					+ "                        <li style=\"font-size: 20px; margin: 30px;\"><a href=\"https://namu.wiki/w/%EC%A1%B0%EC%9C%A0%EB%A6%AC\" target=\"_blank\">조유리</a></li>\r\n"
					+ "                        <li style=\"font-size: 45px; margin:20px; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\">JO YU RI</li>\r\n"
					+ "                            <div class=\"subText3\">\r\n"
					+ "                                <li>생일 2001년 10월 22일</li>\r\n"
					+ "                                <li>혈액형 AB형</li>\r\n"
					+ "                                <li>키 160cm</li>\r\n"
					+ "                                <li>취미 만화책 읽기, 공포영화 보기</li>\r\n"
					+ "                                <li>특기 드럼,피아노,노래</li>\r\n"
					+ "                            </div>\r\n"
					+ "                    </ul>\r\n"
					+ "                </div>\r\n"
					+ "            </div>\r\n"
					+ "        </div>\r\n"
					+ "        <div box>\r\n"
					+ "            <div class=\"box4\">\r\n"
					+ "                <img src=\"https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F445%2F2023%2F02%2F18%2F0000096272_001_20230218170902589.jpg&type=a340\" alt=\"최예나\">\r\n"
					+ "                <div class=\"text4\">\r\n"
					+ "                    <ul>\r\n"
					+ "                        <li style=\"font-size: 20px; margin: 30px;\"><a href=\"https://namu.wiki/w/%EC%B5%9C%EC%98%88%EB%82%98\" target=\"_blank\">최예나</a></li>\r\n"
					+ "                        <li style=\"font-size: 45px; margin:20px; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\">CHOI YE NA</li>\r\n"
					+ "                            <div class=\"subText4\">\r\n"
					+ "                                <li>생일 1999년 9월29일</li>\r\n"
					+ "                                <li>혈액형 A형</li>\r\n"
					+ "                                <li>키 163cm</li>\r\n"
					+ "                                <li>취미 만화책 읽기, 영화 보기</li>\r\n"
					+ "                                <li>특기 인형뽑기,게임</li>\r\n"
					+ "                            </div>\r\n"
					+ "                    </ul>\r\n"
					+ "                </div>\r\n"
					+ "            </div>\r\n"
					+ "        </div>\r\n"
					+ "\r\n"
					+ "        <div box>\r\n"
					+ "            <div class=\"box5\">\r\n"
					+ "                <img src=\"https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F477%2F2022%2F11%2F26%2F0000396846_001_20221126174802409.jpg&type=a340\" alt=\"\">\r\n"
					+ "                <div class=\"text5\">\r\n"
					+ "                    <ul>\r\n"
					+ "                        <li style=\"font-size: 20px; margin: 30px;\"><a href=\"https://namu.wiki/w/%EA%B9%80%EC%B1%84%EC%9B%90(LE%20SSERAFIM)\" target=\"_blank\">김채원</a></li>\r\n"
					+ "                        <li style=\"font-size: 45px; margin:20px; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\">KIM CHAE WON</li>\r\n"
					+ "                            <div class=\"subText5\">\r\n"
					+ "                                <li>생일 2000년 8월 1일</li>\r\n"
					+ "                                <li>혈액형 B형</li>\r\n"
					+ "                                <li>키 164cm</li>\r\n"
					+ "                                <li>취미 영화보기,안무 영상 보기</li>\r\n"
					+ "                                <li>특기 매운 음식먹기</li>\r\n"
					+ "                            </div>\r\n"
					+ "                    </ul>\r\n"
					+ "                </div>\r\n"
					+ "            </div>\r\n"
					+ "        </div>\r\n"
					+ "    </div>\r\n"
					+ "\r\n"
					+ "    <footer>\r\n"
					+ "        <a href=\"#\">공지사항</a> \r\n"
					+ "        <a href=\"#\">이용약관</a> \r\n"
					+ "        <a href=\"#\">개인정보취급방침</a> \r\n"
					+ "        <a href=\"#\">문의사항</a>" );
			
			msg.append("</body>");
			msg.append("</html>");
			
			mail.setHtmlMsg(msg.toString());
			
			
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\study-java\\WorkSpace\\12.IO_FileTest\\pic.jpg");
			//이미지 파일 경로를 넣어줌.(경로를 찾을 수 없습니다 오류나오면 주석할꺼임)
			mail.attach(file);//메일에 파일추가
			
			file = new EmailAttachment();
			file.setURL(new URL("https://www.digimonmasters.com/images/header/visual_bg_dig02.png"));
			mail.attach(file);
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침. ↑
			
			mail.send();
			
		} catch (EmailException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
	}
	
	
	
}
