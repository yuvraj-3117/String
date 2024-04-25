package STRINGCLASS;

public class FindBiggestAlphabate {

	public static void main(String[] args) {
		String s = "ADECB";
		char a[] = s.toCharArray();
		char  max;

		max=a[0];//suru ke element ko gretest maan liya//
		System.out.println("bigeest alphabate is");
		for(int i=1;i<a.length;i++)    //1 sem islie becoz sure ke elemt ko max phele hi maan liya 
	{
			if(a[i]>max)//a[i]<max isme smallest aiphabate aa jyga
			{
				max=a[i];
			}}
		System.out.println(max);
}
	}


