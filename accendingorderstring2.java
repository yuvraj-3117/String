package STRINGCLASS;

public class accendingorderstring2 {

	public static void main(String[] args)
	{
		String s = "acbde";
		char a[] = s.toCharArray();
		char temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])//a[i]<a[j]; decending ke liye
				{
				   temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		System.out.println(a);
		//System.out.println(new String(a));//
	
	}	}


