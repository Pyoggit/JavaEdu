package kr.co.objectfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException {
		//객체를 파일로 저장한다.
		//1. FileOutputStream => ObjectOutputStream
		//2. ObjectOutputStream 제공
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student stu = new Student(10, "jp" ,100);
		oos.writeObject(stu);
		
		oos.close();
		fos.close();
		System.out.println("the end");
	}
}
