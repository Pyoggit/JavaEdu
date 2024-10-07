package kr.co.even;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenMain {

	public static void main(String[] args) {
				
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> sublist = list.stream() // (2) 스트림생성
				.filter(e -> e%2 == 0) // (3) 스트림처리
				.map(e -> e*e) // (4) 스트림처리
				.collect(Collectors.toList()); // (5) 결과생성
		System.out.println(sublist); // (6) 결과출력
	}
}
