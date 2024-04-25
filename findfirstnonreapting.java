package STRINGCLASS;

public class findfirstnonreapting {
	public static void main(String [] ars) {
		
		String s = "helloh word";
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}}
				if(count==1)// 
                                    //if(count>1)// means first reapeted
				{  
	System.out.print("find first non reapting charecter "+s.charAt(i));
			break;
				
			}
			
		}
	}

}
