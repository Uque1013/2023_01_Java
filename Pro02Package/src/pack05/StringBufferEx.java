package pack05;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This"); // sb = "This" | 이 sb와 아래 sb들이랑 다른게 아니라 내용이 바뀐거임 
		
		sb.append(" is pencil"); // sb의 문자열 뒤에 붙이기
		System.out.println(sb);	 // sb = "This is pencil"
		
		sb.insert(7, " my");	// sb 문자열의 인덱스 7번째(0부터 출발) 위치에 " my"삽입
		System.out.println(sb); // sb = "This is my pencil"
		
		sb.replace(8, 10, "your"); // sb 문자열의 8번째부터 10-1(9)번째 문자열을 "your"로 교체
		System.out.println(sb);		// sb = "This is your pencil"
		
		sb.delete(8, 13);		// sb가 가리키는 8번째 문자열에서 13-1(12)번째까지 삭제
		System.out.println(sb);	// sb = "This is pencil"
		
		sb.setLength(4);		// sb의 길이는 "This is pencil"이면 14인데, 4로 설정하면
								// 문자열 앞 4개만 남겨두고 뒤의 문자열을 삭제함
		System.out.println(sb); // sb = "This"

	}

}
