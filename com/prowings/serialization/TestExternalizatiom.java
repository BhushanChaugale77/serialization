package com.prowings.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizatiom {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student std = new Student(10, "Ram", 30);
		 
		File file = new File("myEmployee.txt");
		
		//Serilization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std);
		System.out.println("Object written to file successfully!!!");
		
		//Deserilization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student desrializedStd = (Student) ois.readObject();
		System.out.println("Student after deserilization : "+desrializedStd);
		
		
		
		
		
	}
	
}
