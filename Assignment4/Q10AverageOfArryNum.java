// Q10. Find Average of Element in arry

import java.util.Scanner;

class Q10AverageOfArryNum{

public static void main(String[] args){

System.out.println("Enter 5 integer");

int arr[]= new int[5];
int sum=0;
int average=0;

Scanner sc= new Scanner(System.in);

for(int n: arr){

n=sc.nextInt();
sum=sum+n;
System.out.println(sum);

average=sum/arr.length;

//System.out.println(arr.length);


}
System.out.println(average);
}}




