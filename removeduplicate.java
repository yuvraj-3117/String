package STRINGCLASS;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate {

public static void main(String[] args) {
String s ="aaabbbccc";
StringBuilder sb = new StringBuilder();
Set<Character> st = new LinkedHashSet();
for(int i=0; i<s.length();i++)
{

	st.add(s.charAt(i));
		
}
for(Character c:st)  
{
	sb.append(c);
	}
System.out.print(sb);
		
}
}