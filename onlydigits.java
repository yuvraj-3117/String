package raiworldcoding;

public class onlydigits {

	public static void main(String[] args)//48 to 57
	{
		// TODO Auto-generated method stub
		
	    char a[] = {'#', '$', '@', 'a', 'n' , '1','5'};

        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                System.out.println("Alphabets are: " + a[i]);
            }
        }
    }
}


