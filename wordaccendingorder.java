package STRINGCLASS;
public class wordaccendingorder {
	

		public static void main(String[] args) 
		{
				String s ="this is a for you";
				String a[]=s.split(" ");
				
				for(int i=0;i<a.length-1;i++)
				{
				for(int j=i+1;j<a.length;j++)
					
			{
					
			if(a[i].length()>a[j].length())         //decending a[i].length<a[j].length
			{								
			String d =a[i];
			a[i]=a[j];
			a[j]=d;
						
	}}}
				
				for(String j:a)
			
				{
					System.out.println(j);
				}

	}}
