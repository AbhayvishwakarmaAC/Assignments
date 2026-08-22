//Question2: Print multiple of 3 between 1 to N
import java.util.Scanner;
class Q2PrintMultipleofN{


public static void main(String args[]){

System.out.println("Enter Number for finding multiple for 3");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1; i<=n; i++){
if(i%3==0){
System.out.println(i);
}

}

}}

