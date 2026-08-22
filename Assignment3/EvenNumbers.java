class EvenNumbers{


static void printEvenNumbers(){

int num=1;
while(num<=50){

System.out.print((num%2==0)?num:"");
System.out.print(" ");
num++;

}

}

public static void main(String args[])
{

printEvenNumbers();

}}
