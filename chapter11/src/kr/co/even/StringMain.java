package kr.co.even;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMain {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "Stream", "Library");
		List<Integer> sublist = list.stream() // (2) 스트림생성
				.map(t -> t.length()) // (3) 스트림처리
				.collect(Collectors.toList()); // (4) 결과생성
		System.out.println(sublist); // (5) 결과출력
		
	}

}
