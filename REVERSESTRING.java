package STRINGCLASS;

public class REVERSESTRING
{

	public static void main(String[] args) {
		
		String s = "yuvraj singh patel";
		
		//aproche//
		char a[] = s.toCharArray();//cherecter by cherector reverse hoga isliye charectorArray//
		for( int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]);
		}
		
			

}}
