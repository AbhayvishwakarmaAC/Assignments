import java.util.Scanner;

class SumOfnNumber{

static void calculatesum(int n){
int sum=0;
for(int i=1; i<=n; i++){
sum=sum+i;
}
System.out.println(sum);


}
public static void main(String args[]){

System.out.println("Enter nth number to calculate Sum");

Scanner sc= new Scanner(System.in);
int n=sc.nextInt();

calculatesum(n);



}}