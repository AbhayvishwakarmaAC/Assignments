//Question7:Print Sum of Odd Numbers from 1 to N
import java.util.Scanner;
class Q7SumOfArry{

public static void main(String args[]){

System.out.println("Enter 5 integer Arry");
Scanner sc= new Scanner(System.in);

int arr[]=new int[5];
int sum=0;

for(int num: arr){

num=sc.nextInt();
sum=sum+num;
}
System.out.print("the Sum of Arry is "+sum);

}}
