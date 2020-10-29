package day1029.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;

/*
 	Collection Framework(전제조건은 객체만을 대상으로 한다.)
 	-자바 언어에서는 객체를 모아서 처리할 때 유용한 api를 지원하는데
 		이 api를 가리켜 컬렉션 프레임워크라고한다.
 		그리고 java.util에서 지원하다.
 	-컬렉션 프레임워크에서 지원하는 객체의 수는 상당히 많기는 하지만, 크게는 모여진 모습에 따라서
 	(1)순서 있는 유형 List형: 배열과 거의 같다!! [][][][]...
 							자바의 배열과 차이가 있다면,
 							배열: 1.반드시 생성할 때 크기를 명시해야 한다. 따라서 동적으로 늘어날 수 없다.(고정적)
 									2.자료형을 섞어 사용할 수 없다.
 										ex) int[] arr = new int[5]; //오직 int형만 넣을 수 있다.
 							리스트: 크기가 자유롭다. 객체자료형을 섞어서 넣을 수 있다.
 								
 							
 	(2)순서 없는 유형 Set형:
 	(3)key-value의 유형 Map형:
 */

public class CollectionApp {
	//List형을 테스트 해보자
	public void showList() {
		//List형의 최상위 객체인 List는 인터페이스이며, List로 기본적으로 가져야 할 추상메서드가 명시되어 있다.
		//Generic Type으로 선언하면, 컬렉션 프레임워크에 넣을 수 있는 자료형을 제한할 수 있다.
		ArrayList<JButton> list = new ArrayList<JButton>();//리스트 구조들은 배열과 거의 같다!![][][]
		//js의 배열과 동작방식 동일
		list.add(new JButton("첫 버튼")); //0
		//list.add("사과"); //1
		//list.add("복숭아");
		//list.add("멜론");
		list.add(new JButton("마지막 버튼"));
		System.out.println("리스트의 데이터 수는 "+list.size());//배열은 length지만, 컬렉션 프레임워크는 모두 size()를 이용
		
		for (int i = 0; i < list.size(); i++) {
			JButton bt1 = list.get(i);//섞어서 들어가므로, 반환형은 Object형이 반환된다..	
			System.out.println(bt1.getText());
		}
		
		//리스트는 중복된 데이터를 허용할까?
		//결론: 중복여부는 따지지 않고 무조건 넣는다!!
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		System.out.println("list2의 데이터 수는"+list2.size());
	}
	
	public void showSet() {
		HashSet<String> set = new HashSet<String>();
		set.add("banana");
		set.add("banana");
		set.add("banana");
		set.add("banana");
		
		System.out.println("HashSet의 크기는 "+set.size());
		//결론: 중복된 데이터 받아 들이지 않음
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("바나나");
		set2.add("포도");
		set2.add("블루베리");
		
		Iterator<String> iter= set2.iterator();
		//반복문으로 set2의 모든 데이터를 출력!!
		while(iter.hasNext()) {
			String e = iter.next();
			System.out.println(e);
		}
		
	}
	
	public void showMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("k1", "장미");
		map.put("k2", "튤립");
		map.put("k3", "안개꽃");
		map.put("k3", "할미꽃");
		System.out.println("map의 길이는"+map.size());
		//key값은 중복을 허용하지 않는다.. 따라서 대체되어 버린다.
		
		Iterator<String> iter = map.keySet().iterator();
		
		//반복문을 이용해서 모든 꽃을 출력
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
	}
	
	public static void main(String[] args) {
		CollectionApp app = new CollectionApp();
		app.showList();
		app.showSet();
		app.showMap();
	}
}












