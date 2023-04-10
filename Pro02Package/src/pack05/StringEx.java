package pack05;

public class StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("#"));	
		
		a = a.concat(b);	// 문자열 연결
		System.out.println(a);
		
		a = a.trim();		// 문자열의 맨 앞 부분과 뒤 부분의 공백을 제거 
		System.out.println(a);

		a = a.replace("C#", "Java");	// a 문자열의 C#을 Java로 문자열 교체
		System.out.println(a);
		
		String s[] = a.split(",");		// 문자열을 분리(기준 : , )  
		for(int i = 0; i < s.length; i++)
			System.out.println("분리된 문자열"+i+": "+s[i]);
		
		a = a.substring(5);				// a 문자열의 인덱스 5번째 이후 문자열 출력
		System.out.println(a);
		
		char c = a.charAt(2);			// 인덱스 2번째
		System.out.println(c);
	}

}
