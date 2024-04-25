package STRINGCLASS;

public class countword {

	public static void main(String[] args) {
		String s = "java is a best lang";
		int count =0;
		String a[]= s.split(" ");
		for(int i=0; i<a.length;i++)
			
		{
			count++;
		}
		System.out.println(count);
	}

}
