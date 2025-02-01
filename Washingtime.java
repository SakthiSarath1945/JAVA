import java.util.*;
class Washingtime{
public static void main(String[] args){
System.out.println("Enter the amount of Load:");
Scanner sc=new Scanner(System.in);
int weight=sc.nextInt();
if(weight>=0 && weight<=2000){
System.out.println("Time Estimation:25 min");
}
else if(weight>=2001 && weight<=4000){
System.out.println("Time Estimation:35 min");
}
else if(weight>4001 && weight<=7000){
System.out.println("Time Estimation:45 min");
}
else if(weight<0){
System.out.println("Invalid Input");
}
else if(weight>7000){
System.out.println("Overloaded");
}
}
}

				 			