package raiworldcoding;

public class countUpperCaseAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[] = {'a','b', 't','A','G'};
		
		int count= 0;
		for(int i=0; i<a.length;i++) {
			
			if(a[i]>='A'&& a[i]<='Z') {
				
				count++;
			}
			
		}
		System.out.println("upper case"+count);
	}

}
