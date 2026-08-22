//Q29. String Concatenation and object creation


class Q29StringConcatenation{

public static void main (String args[]){


String str1="Hello";
String str2="Hello";
String str3= str1+str2;
boolean concted=str3==str1;

System.out.println("Is str3 pointing to same object as str1? "+concted);

}}