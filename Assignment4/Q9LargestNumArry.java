// Q9. Find Largest Number of Arry

import java.util.Scanner;

class Q9LargestNumArry{


public static void main(String args[]){

System.out.println("Enter 5 Integer");

Scanner sc = new Scanner(System.in);
int arr[]=new int[5];
int a=0;
int max = arr[0];
for(int num: arr){
num=sc.nextInt();
a = Math.max(max, num); 
}
System.out.println("The latgest element is:"+a);


}}

