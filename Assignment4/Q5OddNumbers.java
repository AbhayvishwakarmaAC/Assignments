//Question5:Print Sum of Odd Numbers from 1 to N
import java.util.Scanner;
class Q5OddNumbers{

public static void main(String args[]){
System.out.println("Enter a Number");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();

int sum=0;

for(int i=1 ; i<=n; i++){
if(i%2!=0){
sum=sum+i;
}
}

System.out.println("The sum of odd numbers from 1 to "+n+" is: "+sum);

}}
