package kr.co.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		
		String[] name =  new String[] {"Kim", "Park", "Lee", "Choi", "Chee","Park"};
		List<String> list1 = Arrays.asList(name);
		
		//1.배열,컬렉션 => 스트림으로 변경
		Stream <String> streamList = list1.stream();
		Stream <String> stream = Arrays.stream(name);
		
		//2.스트림 중간처리 연산1(필터기능)
		Stream <String> stream2 = stream.filter(new Predicate<String>() {
			@Override
			public boolean test(String str) {
				char ch = str.charAt(0);
				return ch == 'C';
			}
		});
		
		//3.스트림 중간처리 연산2(정렬기능)
		Stream <String> stream3 = stream2.sorted(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		});
		
		//4.스트림 종단처리(배열이나, collection프레임으로 변경시켜줌
		List<String> list = stream3.collect(Collectors.toList());//arrayList로 바꿔줌
		
		//String[] name2 = (String[])list.toArray(new String);
		
		//5.결과 출력
		for(String data:list) {
			System.out.println(data + "\t");
		}
		//========================
//		System.out.println("========================");
//		for(String data:name2) {
//			System.out.println(data + "\t");
//		}
	}	

}
