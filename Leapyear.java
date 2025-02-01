import java.util.*;
class Leapyear{
public static void main(String[] args){
System.out.println("Enter a year:");
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
if(year%4==0){
System.out.println("It's a Leap year,and it contain extra day in Feb");
}
else{
System.out.println("It's not a Leap year");
}
}
}
