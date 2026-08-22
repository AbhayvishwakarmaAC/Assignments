//Q11. Count positive and negative Number is array

import java.util.Scanner;

class Q11PosOrNegInArry{

public static void main(String args[]){


System.out.println("Enter 5 integer");

Scanner sc=new Scanner(System.in);

int arr[]=new int[6];
int pos=0;
int neg=0;
int zero=0;

for(int n:arr){
n=sc.nextInt();

if(n>0){
pos++;
}else if(n<0){
neg++;}
else zero++;



}
System.out.println("The Positive numbers are"+pos);
System.out.println("The Positive numbers are"+neg);
System.out.println("The zero are"+zero);

}}