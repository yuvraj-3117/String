package STRINGCLASS;

public class stringrefrences2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("rohit");//heap me memory lega alag alag object bnenge
		System.out.println(s1);//output rohit
		s1.concat("patel");//output rohit
		System.out.println(s1);//curenobject me change nhi hoga
		
		//case2
		String s3 = new String("abc");
		String s4 = s3.concat(" pqr");//s4 alag object bna lega abc pqr store kr lega
		System.out.println(s3);//abc
		System.out.println(s4);//abc pqr
		
		//case3
		s3 = s3.concat("  pqr");//s3 me assign kr ke concate kr skhte he isse s3 phele abc tha woh destroy ho jyga or abc pqr aa jyga
		System.out.println(s3);//abc pqr	

	}

}
