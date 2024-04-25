package STRINGCLASS;

public class countcharinstring {

	public static void main(String[] args) {

		String s =" yuvraj singh patel";
		
		for(char c ='a'; c <='z'; c++)
		{
			int count =0;
			for(int i =0; i<s.length(); i++)
			{
				if(c== s.charAt(i))
				{
					count++;
				}}
				if(count!=0)
				{
					System.out.print(c+"="+count);				
					}
			}
		}
	}


            