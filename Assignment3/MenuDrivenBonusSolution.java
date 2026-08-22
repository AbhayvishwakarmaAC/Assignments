import java.util.Scanner;
class MenuDrivenBonusSolution{


static void gradeEvaluationSystem(Scanner sc){

System.out.println("Enter Maths Marks");
int maths=sc.nextInt();
System.out.println("Enter Science Marks");
int science=sc.nextInt();
System.out.println("Enter History Marks");
int history=sc.nextInt();

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

static void leapYearCheck(Scanner sc){
System.out.println("Enter a Year");

int year=sc.nextInt();
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

static void dayofTheWeek(Scanner sc){
System.out.println("Enter Day from 1 to 7");
int day=sc.nextInt();
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

static void vraiableDefaultValue(Scanner sc){

System.out.println("The Variables Default values are");
byte a=10;
System.out.println("byte "+a);
short b=100;
System.out.println("short "+b);
int c=1000;
System.out.println("int "+c);
long e=1000L;
System.out.println("long "+e);
float d=10.0f;
System.out.println("float "+d);
double f=10.444444;
System.out.println("double "+f);
char g='A';
System.out.println("char "+g);
boolean h=true;
System.out.println("booolean "+h);


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
gradeEvaluationSystem(sc);
break;
case 2:
leapYearCheck(sc);
break;
case 3:
dayofTheWeek(sc);
break;
case 4:
vraiableDefaultValue(sc);
break;
default:
}

}}