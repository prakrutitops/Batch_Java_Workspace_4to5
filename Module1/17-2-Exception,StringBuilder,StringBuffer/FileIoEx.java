package com.a172;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoEx 
{
	public static void main(String[] args) throws IOException 
	{
		String s =new String("Hello From Tops");
		FileOutputStream fout = new FileOutputStream("E://avadh.txt");
		fout.write(s.getBytes());
		System.out.println("success");
		
		
	}
}
