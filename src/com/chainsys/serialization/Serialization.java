package com.chainsys.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serialization {

	//Serialization - objects into byte stream conversion
	public static void main(String[] args) throws IOException {
		Student s=new Student("Arunachalam", 24, "Kovilpatti");
		Student s1=new Student("Momo",62,"tvl");
		
		System.out.println("Serialization started");
		
		FileOutputStream fos=new FileOutputStream("sample2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.writeObject(s1);
		
		oos.flush();
		
		System.out.println("Serialization completed");
		oos.close();
		//Static - cannot be changed during deserializtion it carry the same value what it has during serialization
		//transient - doesn't save the data

	}

}
