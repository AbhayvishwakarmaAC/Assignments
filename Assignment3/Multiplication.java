import java.util.Scanner;

class Multiplication{

static void printMultiplicationTable(Scanner sc){

int num=sc.nextInt();

for(int i=1; i<=10; i++){
System.out.println(num+" x "+i+" "+(num*i));

}

}

public static void main(String args[]){

Scanner sc= new Scanner(System.in);


printMultiplicationTable(sc);


}}



