import java.util.Scanner;
class AgeChecker{


void checkAgeCategory(int age){
if(age>0&&age<80){
if(age<=18){
System.out.println("You are minor");
}else if(age<60){
System.out.println("You are adult");
}else System.out.println("You are Senior citizen");
}else System.out.println("Wrong input");

}


public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter yout age");

int age=sc.nextInt();

AgeChecker obj=new AgeChecker();

obj.checkAgeCategory(age);


}}