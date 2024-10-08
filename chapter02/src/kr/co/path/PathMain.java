package kr.co.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMain {

	public static void main(String[] args) {
		//path 클래스 정보
		Path path = Path.of("D:\\JavaTest\\chapter02\\test.txt");
		System.out.println("전체경로: " + path.toString());
		System.out.println("파일이름: " + path.getFileName());
		Path path2 = path.getParent();
		System.out.println("부모이름: " + path2.getFileName());
		System.out.println("인덱스: "+ path.getName(0));
		
	}

}
