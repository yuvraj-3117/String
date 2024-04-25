package STRINGCLASS;

public class finduniquecharinstring {
	public static void main(String [] args) {

	
	String s= "aaabbbcc";
	int l =s.length();
	int i=0;
	while(i<l)
	{
		char c =s.charAt(i);
		int firstindex =s.indexOf(c);
		int lastindex=s.lastIndexOf(c);
		
		if(firstindex==lastindex)
		{
			System.out.print(c);
			i++;
		}
	}
	}}

