import java.util.Scanner;
class SumOfTwoNumbers{


int a;
int b;

int method(){

return (a+b);

}

public static void main(String args[]){


SumOfTwoNumbers sum = new SumOfTwoNumbers();

Scanner num= new Scanner(System.in);
System.out.println("Enter the First Number");
int a=num.nextInt();
sum.a=a;


System.out.println("Enter the Second Number");
int b=num.nextInt();
sum.b=b;


int result=sum.method();

System.out.println("The Sum of "+a+" and "+b+" is "+result);


}}
