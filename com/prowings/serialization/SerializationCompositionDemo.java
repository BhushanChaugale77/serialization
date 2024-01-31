package com.prowings.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationCompositionDemo {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Head head = new Head("ZZZ", 123456);
		Engine engine = new Engine("Gurkha",2.5f,head);
		Car car = new Car("Force", 2023, engine);
		
		System.out.println("Car object to be serilized :" +car);
		
		File file = new File("CarComposition.txt");
		
		//Serialization
	
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(car);
		
		System.out.println("Object written to file successfully!!");
	
		//Deserialiazation
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car desrializedCar = (Car) ois.readObject();
		
		System.out.println("Car object after DEserialization : " +desrializedCar);
		
		
		
	}
	
}
