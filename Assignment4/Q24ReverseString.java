//Q 24. reverse a String 


import java.util.Scanner;
class Q24ReverseString{



public static void main (String args[]){


System.out.println("Enter a String");
Scanner sc= new Scanner(System.in);

String name=sc.nextLine();

String reverse="";

for(int i=name.length()-1; i>=0; i--){

reverse=reverse+name.charAt(i);
}
System.out.println(reverse);

}}