package STRINGCLASS;

public class stringclass {
	
	//it is immutable in java because do not change is curntobject

	public static void main(String[] args) {
String a = "yuvraj";//letral poll me memory lega
String b ="yuvraj";
System.out.println(a);//output yuvraj
System.out.println(b);//output yuvraj becuse same object bnega same output
a.concat("patel");

System.out.println(a);//output yuvraj becuse current object me change nni kr skte


a=a.concat("patel");
System.out.println(a);//yuvrajpatel yese kr skte he yeah new object bna lega yuvrajpatel store ho jyga or yuvraj naam ka object ek destroy ho jyga
//case2 new keyword se heap me memory lega


String c = new String("rohit");//heap me memory lega alag alag object bnenge
String d = new String("rohit");//or output bhi agal alag aayga


System.out.println(c);
System.out.println(d);


	}

}
