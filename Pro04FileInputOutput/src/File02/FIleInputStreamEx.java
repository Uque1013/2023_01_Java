package File02;

import java.io.FileInputStream;
import java.io.IOException;

public class FIleInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte[6];
		
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			// fin 입력파일 객체변수로 "test.out"파일을 가리킨다.
			int n = 0, c;
			while((c=fin.read())!= -1) {	// fin이 가리키는 "test.out"파일에 있는 내용을
				// 읽어서 c에 저장
				b[n] = (byte)c;		// byte타입으로 형변환 하여서 배열 b에 저장
				n++;	// 배열의 인덱스를 증가하기 위함
			}
			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			for(int i = 0; i < b.length; i++)
				System.out.print(b[i]+" ");
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요.");
		}

	}

}
