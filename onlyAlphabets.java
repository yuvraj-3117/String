package raiworldcoding;

public class onlyAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     char a[] = {'#', '$', '@', 'a', 'n'};

	        for (int i = 0; i < a.length; i++) {
	            if ((a[i] >= 'A' && a[i] <= 'Z') || (a[i] >= 'a' && a[i] <= 'z')) {
	                System.out.println("Alphabets are: " + a[i]);
	            }
	        }
	    }
	}


