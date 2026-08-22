import java.util.Scanner;
class MenuDriven{


static void gradeEvaluationSystem(){

int maths=10;
int science=15;
int history=10;
int totalmarks=maths+science+history;
int average=totalmarks/3;
System.out.println("Average Marks: "+average);
if(average>=90){
System.out.println("Grade: A");
}else if(average>=70){
System.out.println("Grade: B");
}else if(average>=50){
System.out.println("Grade: C");
}else if(average>=30){
System.out.println("Grade: D");
}else if(average<30){
System.out.println("Failed:(Aur padhai karo)");
}


}

static void leapYearCheck(){

int year=1900;
if(year%4==0 || year%400==0){
if(year%100==0){
System.out.println(year+" is not a Leap year");
}
else{
System.out.println(year+" is a Leap year");
}}
else{
System.out.println(year+" is a not Leap year");
}


}

static void dayofTheWeek(){

int day=1;
switch(day){
case 1: System.out.println("The Day is Sunday");
break;
case 2: System.out.println("The Day is Monday");
break;
case 3: System.out.println("The Day is Tuesday");
break;
case 4: System.out.println("The Day is Wednesday");
break;
case 5: System.out.println("The Day is Thursday");
break;
case 6: System.out.println("The Day is Friday");
break;
case 7: System.out.println("The Day is Saturday");
break;
default:System.out.println("Invalid day number");
}


}

static void vraiableDefaultValue(){


byte a=10;
System.out.println(a);
short b=100;
System.out.println(b);
int c=1000;
System.out.println(c);
long e=1000L;
System.out.println(e);
float d=10.0f;
System.out.println(d);
double f=10.444444;
System.out.println(f);
char g='A';
System.out.println(g);
Boolean h=true;
System.out.println(h);


}



public static void main(String args[]){

System.out.println("Enter your choice");
System.out.println("1: Grade Evaluation System");
System.out.println("2: Leap Year Check");
System.out.println("3: Day of the week");
System.out.println("4: Identify Default Values of Variables");
System.out.println("5: Exit");
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();

switch(a){

case 1:
gradeEvaluationSystem();
break;
case 2:
leapYearCheck();
break;
case 3:
dayofTheWeek();
break;
case 4:
vraiableDefaultValue();
break;
default:
}

}}