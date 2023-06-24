package placement_prep;

public class ReplaceWithSplChar
{
	public static String capitalizeWord(String str)
	{   
		String words[]=str.split(" ");   
		String capitalizeWord="";   
		for(String w:words)
		{   
			String first=w.substring(0,1);   
			String afterfirst=w.substring(1);   
			capitalizeWord+=first.replaceAll(first, "@")+afterfirst+" ";   
			//capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
		}   
		return capitalizeWord.trim();   
	}  

	public static void main(String[] args)  
	{   
		System.out.println(ReplaceWithSplChar.capitalizeWord("Java is awesome"));   
		System.out.println(ReplaceWithSplChar.capitalizeWord("Java is OOP language"));   
	}   
}