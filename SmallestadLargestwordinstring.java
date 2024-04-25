package STRINGCLASS;

public class SmallestadLargestwordinstring {
	public static void main(String [] args) {
		String s = "my name is a yuvraj";
		String a[]=s.split(" ");	
		String smallest=a[0];
		String largest="";
		
		for(String s1:a)
		{
			if(s1.length() < smallest.length())
			{
				smallest=s1;//ager aane wala word chota 
			}  //he samllest se ho smallest me uuse dal denge
			else if(s1.length()>largest.length())
			{
				largest=s1;
			}		
		}
		
		System.out.println("smallest word is ::"+smallest);
		System.out.println("largest word is ::"+largest);
	
		
	}

}
