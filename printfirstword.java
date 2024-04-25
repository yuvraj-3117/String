package STRINGCLASS;

public class printfirstword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "yuvraj singh patel";
		
		String a[] = s.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			String s1 = a[i];
		
		System.out.print(s1.charAt(0)+" ");
	}
	}
}
