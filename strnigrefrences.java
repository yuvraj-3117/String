package STRINGCLASS;

public class strnigrefrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "yuvraj";//letral poll me memory lega
		String s2 ="yuvraj";
		String s3 = new String("yuvraj");//heap me memory lega alag alag object bnenge
		String s4= new String("yuvraj");//or output bhi agal alag aayga
		
		if(s1==s2)//same object bnega
			System.out.println("hi");
			
			else
			System.out.println("hello");
		
		if(s3==s4)
			//difrent object bnega
			
			System.out.println("hi");
			
			else
			System.out.println("hello");
	}
}

