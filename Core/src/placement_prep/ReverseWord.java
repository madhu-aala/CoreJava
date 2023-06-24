package placement_prep;

public class ReverseWord
{
	String meth(String s) 
	{
		String[] word=s.split(" "); 
		String s1=""; 
		for(int i=word.length-1;i>=0;i--) 
		{ 
			s1+=word[i]+" "; 
		}
		return s1; 
	} 
	public static void main(String[] args)  
	{ 
		String s="Java is Awesome"; 
		String s1=new ReverseWord().meth(s); 
		System.out.println("Input : "+s); 
		System.out.println("Output : "+s1); 
	} 
}