package raiworldcoding;

public class onlySymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[]= {'#','$','@','a','n'};
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<=35 && a[i]<=36 || a[i]<=65)
			
			System.out.println("symbols are"+a[i]+" ");
		}

	}

}
