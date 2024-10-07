package kr.co.student_stream;

//람다식 -> 스트림

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student2Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1111,"jp",90));
		list.add(new Student(1234,"lee",80));
		list.add(new Student(4321,"park",100));
		list.add(new Student(9999,"son",30));
		list.add(new Student(2341,"cha",60));
		
		List <Integer> list2 = list.stream().filter(stu ->  stu.getScore() >= 60)
				.sorted((o1,o2) -> o1.getNo() -o2.getNo())
				.map(Student :: getNo)
				.collect(Collectors.toList());
		
		for(Integer data : list2) {
			System.out.print(data + "\t");
		}
	}

}