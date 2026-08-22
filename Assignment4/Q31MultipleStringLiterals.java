//Q31. Multiple String Liteerals with Same content 


class Q31MultipleStringLiterals{

public static void main (String args[]){


String str1="java";
String str2="java";
String str3="java";
boolean a=str3==str2;
System.out.println("All String point to the same Object : "+a);
boolean b=str2==str1;
System.out.println("All String point to the same Object : "+b);
boolean c=a&&b;


System.out.println("All String point to the same Object : "+c);

}}