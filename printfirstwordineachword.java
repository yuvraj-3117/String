package STRINGCLASS;

public class printfirstwordineachword {

	public static void main(String[] args) {
		
		String s = "yuvraj singh patel";
		String a[] = s.split(" ");
		for(int i=0; i<a.length; i++)
		{
			String f=a[i];      //p h e l e e k w o r d a a y g a t o h u s m e 
			                   //s e f i r s t n i k a l l e n g e
			System.out.print(f.charAt(0));
		}

	   }

      }
