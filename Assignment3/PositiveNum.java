import java.util.Scanner;
class PositiveNum{


static void askForPositiveNumber(){


Scanner sc= new Scanner(System.in);
int num;
do{
System.out.println("Enter a Positive Number");
num=sc.nextInt();
}while(num<0);

}

public static void main(String[] args){


askForPositiveNumber();

}}
