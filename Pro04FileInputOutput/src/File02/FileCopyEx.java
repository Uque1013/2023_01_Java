// c:\\Temp\\test.txt 파일을 이용해서 testout.txt로 복사하는 프로그램을 작성하시오
// FileReader 클래스와 FileWrite클래스를 사용해서 작성하시오
package File02;

import java.io.*;

public class FileCopyEx {

	public static void main(String[] args) {
//		File src = new File("c:\\Temp\\test.txt");
//		File dest = new File("c:\\Temp\\testout.txt");
		String src = "c:\\Temp\\test.txt";
		String dest = "c:\\Temp\\testout.txt";
		int c;
		
		try {
//			FileReader fr = new FileReader("c:\\Temp\\test.txt");
//			FileWriter fw = new FileWriter("c:\\Temp\\testout.txt");
			
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			while((c = fr.read()) != -1) {	// fr은 "test.txt"에 있는 데이터를 한문자씩 읽음
				fw.write((char)c);			// fw가 가리키는 "testout.txt"파일에 출력한다.
			}
			fr.close(); fw.close();
			System.out.println("복사가 잘 되었음");
			// System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		} catch(IOException e) {
			System.out.println("파일복사오류");
		}

	}

}
