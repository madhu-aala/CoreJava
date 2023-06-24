package practice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileOperations
{
	void fileOperations1() throws Exception
	{
		System.out.println("Reading the data");
		FileInputStream fis=new FileInputStream("D:\\txt1.txt");
		System.out.println("Connection Created");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Data Retrived");
		fis.close();
	}
	void fileOperations2() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("D:\\txt1.txt",true);
		System.out.println("Connection Created");
		String data=" because it is Awesome.";
		byte arr[]=data.getBytes();
		fos.write(arr);
		System.out.println("Data Enetered");
		fos.close();
	}
	void fileOperations3() throws Exception
	{
		System.out.println("Copying the data");
		FileInputStream fis=new FileInputStream("D:\\txt1.txt");
		FileOutputStream fos=new FileOutputStream("D:\\txt2.txt");
		System.out.println("Connection Created");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("Data Copied");
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception
	{
		FileOperations aobj=new FileOperations();
		aobj.fileOperations1();
		aobj.fileOperations2();
		aobj.fileOperations3();
	}

}
