 package STRINGCLASS;
import java.util.*;
public class reverseEachWord 
{

	public static void main(String[] args) {
		
		System.out.println(" enter any string "); //my name is yuvraj
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String words [] = s.split(" ");
		
		String  revString = "";
		
		for(int i=0; i<words.length; i++)
		{
			String word =  words[i];
		String revword = ""; 
		
		for(int j = word.length()-1; j>=0; j--)
		{
			revword=  revword+word.charAt(j);
		}
		revString=revString+revword+" ";
		}
		System.out.print(revString+ "");
		
}}