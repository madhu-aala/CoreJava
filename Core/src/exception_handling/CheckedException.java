package exception_handling;

import java.io.*;

public class CheckedException
{
	
	@SuppressWarnings({ "resource", "unused", "rawtypes" })
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("/Desktop/text.txt/");
		Class temp = Class.forName("ClassA");
	}
}