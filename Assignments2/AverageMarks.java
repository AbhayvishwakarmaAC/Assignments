class AverageMarks{
public static void main(String args[]){
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
}}