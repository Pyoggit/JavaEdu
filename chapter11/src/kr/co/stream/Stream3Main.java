package kr.co.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3Main {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Kim", "Park", "Lee", "Choi", "Chee", "Park");
		List<String> sublist = list1.stream() // (2) 스트림생성
				.filter(s -> s.startsWith("C")) // (3) 스트림처리
				.sorted() // (4) 스트림처리
				.collect(Collectors.toList()); // (5) 결과생성
		System.out.println(sublist); // (6) 결과출력
	}
}
