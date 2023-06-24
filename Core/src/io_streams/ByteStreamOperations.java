package io_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamOperations
{
	void FileOperations1() throws IOException
	{
		System.out.println("Reading the data");
		FileInputStream fis = new FileInputStream("D:\\txt1.txt");
		System.out.println("Connection created");
		int i;
		while ((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Data retrived");
		fis.close();
	}
	public static void main(String[] args) throws IOException
	{
		ByteStreamOperations bso = new ByteStreamOperations();
		bso.FileOperations1();
	}
}
