class LeapYear{
public static void main(String args[]){

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
}}