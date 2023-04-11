package pack05;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		// 구분자는 "/"로 설정하였고, 토큰들은 "홍길동", "장화", "홍련", "콩쥐", "팥쥐"
		// 그리고 st 첫번째 토큰을 가리킨다
		while(st.hasMoreTokens())	// st가 가리키는 곳에 토큰이 존재하면 true를 반환
			System.out.println(st.nextToken());
		// st.nextToken()은 st가 가리키는 곳의 토큰을 출력한 후에
		// st는 다음 토큰을 가리키게 된다.
	}

}
