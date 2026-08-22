//Q13. check if Array contain Specific Element
import java.util.Scanner;
import java.util.Arrays;

class Q13SpecificElemntInArray{

public static void main(String args[]){


System.out.println("Enter 6 integer");

Scanner sc=new Scanner(System.in);

Integer arr[]=new Integer[6];

for(int i=0; i<arr.length; i++){

arr[i]=sc.nextInt();

}

System.out.println(Arrays.toString(arr));

System.out.println("Enter the Number to Search ");

int num=sc.nextInt();
if(Arrays.asList(arr).contains(num)) {
    System.out.println("Found");
} else {
    System.out.println("Not Found");
}
}}