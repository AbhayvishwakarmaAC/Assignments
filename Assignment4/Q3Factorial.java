//Question3: Calculate Factorial of n

import java.util.Scanner;

class Q3Factorial{

public static void main(String args[]){

System.out.println("Enter the Number to find factorial");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int factorial=1;

for(int i=1; i<=n; i++){

factorial=i*factorial;
}
System.out.println("Factorial of "+n+" is "+factorial);

}}