package STRINGCLASS;

import java.util.HashMap;
import java.util.Map;

public class coutcharcinstring {
	public static void main(String [] args)
	{
		String s ="a a bbbbdd d";
		
		
		s= s.replace(" " , "");
		
char a[] = s.toCharArray();
int count =0;
Map<Character,Integer> mp = new HashMap<>();
		
for(int i=0; i<a.length; i++)
	{
	count=0;
for(int j=0; j<a.length; j++)
	 {
	 if(a[i]==a[j])
	 count++;	
	}}
		mp.put(a[count], count);
		System.out.print(mp);

	}
	
}