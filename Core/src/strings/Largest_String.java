package strings;

public class Largest_String
{
	public static void main(String[] args)
	{
		String str = "Java is Awesome";
		String str2[] = str.split(" "); 
		String x=str2[0]; 
		int i =0,j = 0; 
		for( i = 0; i < str2.length; i = j) 
		{ 
			for(j =i+1; j < str2.length; j++) 
			{ 
				if(x.length() < str2[j].length()) 
				{ 
					x = str2[j]; 
					break; 
				} 
			} 
		}
		System.out.println("Smallest string:"+ x+"\n"+"Length is:"+x.length());
	}
}