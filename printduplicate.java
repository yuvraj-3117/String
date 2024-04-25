package STRINGCLASS;

public class printduplicate {

	public static void main(String[] args) {
		String s = "abcdeadfklf";
		char a[] = s.toCharArray();
		for (int i =0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])//20==20 so print20 then 30==30 so print  is continue
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
