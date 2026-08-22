//Question26: Check is String is Palindrome
import java.util.Scanner;
class Q26Palindrome{


public static void main(String  [] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String name=sc.nextLine();

String reverse="";

for(int i=name.length()-1; i>=0; i--){
reverse=reverse+name.charAt(i);

  }
if(name.equals(reverse)){

System.out.println("The String "+name+" is a palindrome" );
}
else {
System.out.println("The String "+name+" is not a palindrome" );
}

}
}