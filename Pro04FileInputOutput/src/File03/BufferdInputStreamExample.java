package File03;

import java.io.*;

public class BufferdInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("./src/File03/forest.jpg");
		// 상대경로 인데.. ./는 현재프로젝트이다.
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때 : "+ (end-start)+"ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("./src/File03/forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용했을 때 : "+ (end-start)+"ms");
		bis.close();
		fis2.close();
		
	}
}
