package STRINGCLASS;

public class armstrong {

	public static void main(String[] args) {
	int n =153;
	int sum=0,rem;
	int c=n;
	while(n>0)
	{
		rem= n%10;
	sum = (rem*rem*rem)+sum;
	n=n/10;	
	}
	if(c==sum)
	{
		System.out.println("number is armstrome");
	}else
	{
		System.out.println(" number is not armstrome");
	}

	}

}
