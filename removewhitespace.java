package STRINGCLASS;


public class removewhitespace {
public static void main(String [] agrs)
{
	
	String s = "yuvraj singh patel";
	
	s = s.replaceAll("\\s", "");
	
	System.out.println(s);
}
}
