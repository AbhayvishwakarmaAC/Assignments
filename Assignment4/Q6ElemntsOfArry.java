//Question6:Print all element of an array
import java.util.Scanner;

class Q6ElemntsOfArry{


public static void main(String args[]){

System.out.print("Enter 5 integers: "); 
Scanner sc= new Scanner(System.in);
int arr[]= new int[5];

/*
for(int i=0; i<=5; i++){

arr[i]=sc.nextInt();
System.out.print(arr[i]);
System.out.print(" ");

}*/


for(int value: arr){ // for--etch Synatx

value=sc.nextInt();
System.out.print(value);
System.out.print(" ");

}

}}