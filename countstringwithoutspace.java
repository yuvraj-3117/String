package STRINGCLASS;

public class countstringwithoutspace {

	public static void main(String[] args)
	{
	int count = 0;
String s ="yuvraj singh patel";
	for(int i =0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ' )
		{ 
		count++;
		}
	}
		System.out.print(count);//same
		

	}}

