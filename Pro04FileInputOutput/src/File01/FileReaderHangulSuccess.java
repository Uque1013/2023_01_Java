package File01;

import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderHangulSuccess {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Windows\\system.ini");
			// fin 객체변수는 "system.ini" 파일을 가리키는데 그 데이터 charset은 UTF-8로 설정되어 있다.
			// in = new InputStreamReader(fin, "MS949");
			in = new InputStreamReader(fin, "UTF-8");
			// fin 가리키는 파일을 charset을 "MS949"형식으로 변환시킨 파일을 가리키는 객체변수 in생성
			int c;
			
			System.out.println("인코딩 문자 집합은 : "+in.getEncoding());
			while((c = in.read())!= -1) {
				System.out.print((char)c);
			}
			in.close();	// 객체생성의 역순으로 파일을 가리키는 객체변수는 파일과 연결을 차단한다.
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
