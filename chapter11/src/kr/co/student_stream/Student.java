package kr.co.student_stream;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int no;//primary key
	private String name;
	private int score;
	
	public Student() {
		this(0,null,0);
	}
	public Student(int no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [" + no + "," + name + "," + score + "]";
	}
	@Override
	public int hashCode() {
		
		return no;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student stu)) {
			return false;
		}
		return this.no == stu.no;
	}
	@Override
	public int compareTo(Student stu) {
		return this.no - stu.no;
	}

	
	
}
	