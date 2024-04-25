package STRINGCLASS;

public class Stringmtds {

	public static void main(String[] args) {
		String s1 = new String("HELL0");
		String s2 =  new String(" yuvraj singh");
		System.out.println("length or size of s1 is:"+s1.length());
		
		System.out.println("concate two strings:"+s1.concat(" " +s2));//""+spacee ke liye
		
		System.out.println(s1.replace('H','l'));
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.isEmpty());//false becouse s1 me hello he//
		
		System.out.println(s2.charAt(1));
		
		System.out.println(s2.indexOf('j'));
		
		System.out.println(s1.equals(s2));
	
		System.out.println(s2.trim());
			
		
			
	}

}
