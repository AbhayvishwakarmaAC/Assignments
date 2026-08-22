//Q28. String creataion with new object


class Q28StringCreation{

public static void main (String args[]){


String str1=new String ("hello");
String str2=new String ("hello");
boolean a=(str1==str2);
boolean b=(str1.equals(str2));
System.out.println("Using == : A"+a);
System.out.println("using .equals(): "+b);
}}