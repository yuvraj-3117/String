package STRINGCLASS;

public class finduniqueinstring {
	public static void main(String [] args)
	{
		int temp=0;
		
		//String s= "hettrjjo";
		
		int a[] = {12,57,12,12,17,17,56};
		
	//	for(int i=0; i<s.length(); i++)
		
		for(int i=0; i<a.length; i++)
			
		
		{
			temp=0;
			//for(int j=0; j<s.length(); j++)
			for(int j=0; j<a.length; j++)
			
			{
				if(i!=j)
				{
					//if(s.charAt(i)==s.charAt(j))
					if(a[i] == a[j])
			
					{
						temp++;
					}}}
					if(temp==0)
					{
					//	System.out.print(s.charAt(i)); //hero
						
						System.out.print(a[i]+" ");
					}
					
				}
			}}
		
		
