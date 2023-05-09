package coll02;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = " -> ";
			else 
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");		
		printList(myList);
		//myList.add(0, "터미네이터");	// 인덱스 0번째 방에 터미네이터 데이터 삽입 
		//myList.add(2, "아바타");		// 인덱스 2번째 방에 아바타 데이터 삽입 (둘다 오류나서 주석처리)
		
		printList(myList);
		Collections.sort(myList);		// 오름차순 정렬(ascending sort)
		printList(myList);				// 정렬된 요소 출력
		
		Collections.reverse(myList);	// 요소의 데이터를 역순으로 정렬
		printList(myList);				// 요소 출력
		
		int index = Collections.binarySearch(myList, "스타워즈")+1;
		System.out.println("스타워즈는 "+index+"번째 요소입니다.");

	}

}
