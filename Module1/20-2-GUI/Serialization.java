package com.task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization 
{
	public static void main(String[] args) throws IOException 
	{
		
		Student s1 =new Student(101,"Avadh");
		FileOutputStream fout =new FileOutputStream("E://Tops123.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		System.out.println("Success");
		
	}
}
