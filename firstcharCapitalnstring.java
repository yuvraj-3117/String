package STRINGCLASS;

public class firstcharCapitalnstring {
	
	public static void main (String [] args) {
		String s = "my name is yuvraj singh patel";
		s= " "+s;     //given String me ek space add kr di becuse har word ke baad space he per firsr word ke aage space nhi he;
		String f = "";
		
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c==' ')
			{
			f = f+c;//final string me space add kr di
			i++;
			c= s.charAt(i);   //space ke baad wala world uthyenge or usse capital kr denge
			f= f+Character.toUpperCase(c);				
		}
			else
			{
				f= f+c;
			}}
			System.out.print(f);		
		}}

