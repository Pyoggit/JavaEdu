package kr.co.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4Main {

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
				return o1.compareTo(o2);
			}
		});
		
		//4.스트림 종단처리(배열이나, collection프레임으로 변경시켜줌
		
		Stream <Integer> stream4 = stream3.map(new Function<String, Integer>(){
			@Override
			public Integer apply(String t) {
				return t.length();
			}
			
		});
		
		List<Integer> list = stream4.collect(Collectors.toList());
		
		//5.결과 출력
		for(Integer data:list) {
			System.out.println(data + "\t");
		}

	}	

}

