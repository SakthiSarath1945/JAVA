import java.util.Scanner;
class Operation{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the first number:");
int a=sc.nextInt();
System.out.println("Enter the second number:");
int b=sc.nextInt();
int c=a+b;
System.out.println("the sum of two numbers is:"+c);
int d=a-b;
if(d<0){
System.out.println("the difference of two numbers is:"+d*-1);
}
else{
System.out.println("the difference of two numbers is:"+d);
}
}
}
