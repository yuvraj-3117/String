package STRINGCLASS;

public class owels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This webside for losers lol";
		char vowels , nonvowels;
		char a[] = s.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			if(a[i]=='a'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='e')
			{
				vowels=a[i];
		
			}
			else
			{
				
				nonvowels=a[i];
				System.out.print(nonvowels);
				
			}
		}
					
	}}		

