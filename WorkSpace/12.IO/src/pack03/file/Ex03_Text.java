package pack03.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex03_Text {

	public static void main(String[] args) {
		try {
			Writer writer =new FileWriter("D:\\study-java\\WorkSpace\\12.IO_FileTest\\Ex03_Text.txt");
			writer.write("KYMASD");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
