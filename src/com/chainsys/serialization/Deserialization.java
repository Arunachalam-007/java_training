package com.chainsys.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	//Deserialization - byte stream into object
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("sample2.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	
		Student s1=(Student) ois.readObject();
		System.out.println(s1);
		
		Student s2=(Student) ois.readObject();
		System.out.println(s2);
		
		ois.close();
		fis.close();
	}

}
