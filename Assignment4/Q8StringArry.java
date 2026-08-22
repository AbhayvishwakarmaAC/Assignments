//Q8. All name in string arry

import java.util.Scanner;

class Q8StringArry{

public static void main(String args[]){

System.out.println("Enter 4 Names");

Scanner sc=new Scanner(System.in);

String arr[]= new String[4];

for(String num: arr){

num=sc.next();

System.out.println(num);
}

}}