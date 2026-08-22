//Q14. Find the Index of an Element in an Arry
import java.util.Scanner;
import java.util.Arrays;

class Q14FindIndexOfArray{

public static void main(String args[]){


System.out.println("Enter 5 integer");

Scanner sc=new Scanner(System.in);

int arr[]=new int[5];

for(int i=0; i<arr.length; i++){

arr[i]=sc.nextInt();

}
System.out.println("Enter number to search:");

int num = sc.nextInt();
Arrays.sort(arr);
int index= Arrays.binarySearch(arr,num); // to use this Arry must be sorted 

System.out.println("The number "+num+" found at index "+index);


}}