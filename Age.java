import java.util.Scanner;
class Age {
public static void main(String[] args){
System.out.println("Enter the age:");
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
if ((0<=age && 12>=age)==true){
System.out.println("Child");
}
else if (13<=age && 19>=age){
System.out.println("Teenager");
}
else if(20<=age && 64>=age){
System.out.print("Adult");
}
else if (65<=age){
System.out.print("Senior");
}
else{
System.out.print("Please enter the age above 0");
}
sc.close();
}
}