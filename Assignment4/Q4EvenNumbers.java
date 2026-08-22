//Question4:Print Even Numbers 1 to N
import java.util.Scanner;
class Q4EvenNumbers{

public static void main(String args[]){
System.out.println("Enter the number till even number want");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Even Numbers are");
for(int i=1 ; i<=n; i++){

if(i%2==0){

System.out.println(i);

}}

}}
