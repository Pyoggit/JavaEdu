package kr.co.student_stream;

//배열->람다식 

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {

	public static void main(String[] args) {
		//1.배열생성
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1111,"jp",90));
		list.add(new Student(1234,"lee",80));
		list.add(new Student(4321,"park",100));
		list.add(new Student(9999,"son",30));
		list.add(new Student(2341,"cha",60));
		
		//2.스트림 생성(배열->스트림)
		Stream <Student> stream = list.stream();
		
		//3.중간연산(필터)
		Stream <Student> stream2 = stream.filter(stu ->  stu.getScore() >= 60);
		//4.중간연산(정렬)
		Stream <Student> stream3 = stream2.sorted((o1,o2) -> o1.getNo() -o2.getNo());
		//5.중간연산(맵)
		Stream <Integer> stream4 = stream3.map(Student :: getNo);
		
		//6.종단연산
		List <Integer> list2 = stream4.collect(Collectors.toList());
		//7.출력
		for(Integer data : list2) {
			System.out.print(data + "\t");
		}
	}

}
