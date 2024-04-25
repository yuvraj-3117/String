package STRINGCLASS;
import java .util.Scanner;
public class countfrequency {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		System.out. print("enter any string ");
		String s = sc.nextLine();
	
	for(char c='a' ; c<='z'; c++)
	{
		int count =0; 
		for(int i =0; i<s.length(); i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}}
			if (count!=0)
			{
				System.out.print(c+ "="+count+" ");
				
				
				}
			
		
		}}}

	


