package pack06.go.data;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class JsoupAPI2 {

	public static void main(String[] args) {
		
		String url = "https://api.odcloud.kr/api/15055947/v1/uddi:f5716db6-1deb-4745-b4b3-cd46a3d4f60d_201909271050?page=1&";
		String doc = null;
		
		try {
			doc=Jsoup.connect(url).data("page","1").data("pages","10")
					.data("serviceKey","QdYVi2vpiC7Nk4e/68nBrCGR7ziPyZZRv7drUhvAyGXwFbEohy7IEg/RGIqmpmdQggTvMPMcJGf/d2hyN3x2zQ==")
					.timeout(1000*10)
					.userAgent("Chome")
					.ignoreContentType(true)
					.execute().body();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject jsonObj=(JSONObject) parser.parse(doc);
			System.out.println("파싱성공");
			JSONArray array = (JSONArray) jsonObj.get("data");
			System.out.println("array담기 성공(JsonArray");
			for(int i =0;i<array.size();i++) {
				JSONObject tempObj = (JSONObject) array.get(i);
				System.out.print("시도명 : "+tempObj.get("시도명")+"\t");
				System.out.print("어린이집명 : "+tempObj.get("어린이집명")+"\t");
				System.out.print("어린이집 상태 : "+tempObj.get("어린이집상태")+"\t");
				System.out.println();
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//시도명":"광주광역시","양호실":0,"어린이집명":"리채아이사랑어린이집","어린이집상태":"정상","어린이집유형":"민간"
		

	}
	
}
