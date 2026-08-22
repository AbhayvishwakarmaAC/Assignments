//Q30. String pool with intern()


class Q30StringPool{

public static void main (String args[]){


String str1=new String("Hello");
String str2=str1.intern();
String str3= "Hello";
boolean pointing=str3==str2;

System.out.println("Is str2 and str3 pointing to same object: "+pointing);

}}