package File03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("./src/file03/forest.jpg");
		// src파일 객체를 생성하면 파일에 대한 정보를 얻을 수 있다.
		File dest = new File("./src/file03/copyforest.jpg");
//		String src = "./src/file03/forest.jpg";
//		String dest = "./src/file03/copyforest.jpg";
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			// fi입력객체는 src객체의 파일(forest.jpg)을 가리킨다.
			FileOutputStream fo = new FileOutputStream(dest);
			// fo출력객체는 dest객체의 파일(copyforest.jpg)을 가리킨다.
			while((c = fi.read()) != -1) {	// forest.jpg 파일에서 1바이트씩 읽음
				fo.write((byte)c);			// 1바이트씩 copyforest.jpg파일에 출력한다
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
//			System.out.println("복사가 잘 되었음");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
