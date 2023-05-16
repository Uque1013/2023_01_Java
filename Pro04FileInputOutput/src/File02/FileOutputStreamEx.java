package File02;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout =
					new FileOutputStream("c:\\Temp\\test.out");
			// fout 출력파일 객체변수는 "test.out"파일을 가리킨다.
			for(int i = 0; i < b.length; i++)
				fout.write(b[i]);	// 파일(test.out)에 b[i]의 정수 값(이진수)을 그대로 기록
				// 텍스트 형식이 아님(바이너리 타입이다)
			fout.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요.");
			return;
		}
		System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
		// test.out 파일에 있는 내용을 메모장에 불러오게 되면 데이터가 깨어진 것 처럼 보인다.
		// 왜냐하면 텍스트 파일이 아니기 때문
	}

}
