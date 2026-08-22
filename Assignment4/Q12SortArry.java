//Q12. Sorting an Arry in Ascending Order 

import java.util.Scanner;
import java.util.Arrays;

class Q12SortArry{

public static void main(String args[]){


System.out.println("Enter 6 integer");

Scanner sc=new Scanner(System.in);


int arr[]=new int[6];

for(int i=0; i<arr.length; i++){

arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); //Arrays.toString(arr)--to Convert Array into String 
}}