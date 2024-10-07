package kr.co.stream;

//람다식표현

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2Main {

	public static void main(String[] args) {

		String[] name = new String[] { "Kim", "Park", "Lee", "Choi", "Chee", "Park" };

		// 1.배열,컬렉션 => 스트림으로 변경
		// Stream <String> streamList = list1.stream();
		// Stream <String> stream = Arrays.stream(name);

		// 2.스트림 중간처리 연산1(필터기능)
		// Stream <String> stream2 = stream.filter( str -> str.startsWith("C"));

		// 3.스트림 중간처리 연산2(정렬기능)
		// Stream <String> stream3 = Arrays.stream(name).filter( str ->
		// str.startsWith("C")).sorted((o1,o2) -> o1.compareTo(o2));

		//Stream <Integer> stream4 = stream3.map(t -> t.length());
		
		
		// 4.스트림 종단처리(배열이나, collection프레임으로 변경시켜줌
		List<Integer> list = Arrays.stream(name).filter(str -> str.startsWith("C"))
				.sorted((o1, o2) -> o1.compareTo(o2))
				.map(t -> t.length()).collect(Collectors.toList());

		// 5.결과 출력
		for (Integer data : list) {
			System.out.println(data + "\t");
		}
		// ========================
//		System.out.println("========================");
//		for(String data:name2) {
//			System.out.println(data + "\t");
//		}
	}

}
