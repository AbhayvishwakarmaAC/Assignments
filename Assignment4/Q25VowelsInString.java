//Q 25. Count Vowels in String


import java.util.Scanner;
class Q25VowelsInString{



public static void main (String args[]){


System.out.println("Enter a String");
Scanner sc= new Scanner(System.in);

String name=sc.nextLine();
int count=0;

char[] d={'A','E','I','O','U','a','e','i','o','u'};

for(int i=0; i<name.length()-1; i++){

char c=name.charAt(i);
for(int j=0; j<d.length-1; j++)
if(c==d[j])
{
count++;
}


}
System.out.println("The Number of Vowels is"+count);

}}