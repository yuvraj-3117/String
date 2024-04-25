package STRINGCLASS;
import java.util.*;

public class duplicatestring {

		public static void main(String[] args) 
		{
			
	String s = " my name is my name is yuvraj singh patel";

		String a[]=s.split(" ");
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(  a[i].equals(a[j]))
				{
					System.out.println("Duplicate Found =>"+a[i]);
				}
			}}}}
		