package STRINGCLASS;

import java.util.*;

public class findovelnumber {

	public static void main(String[] args) {
		System.out.print("enter any string");
	Scanner s= new Scanner(System.in);
	
	String st = s.nextLine();
	
	
	st=st.replaceAll("[aeiouAEIOU]", "");
	
	System.out.print(st);
	}

}
