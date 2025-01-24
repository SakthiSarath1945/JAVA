import java.util.Scanner;
class Greatesttwo{
public static void main(String[] args){
System.out.println("enter the numbers:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt(),b=sc.nextInt();
if(a>b){
System.out.println("a is greater");
}
else{
System.out.println("b is greater");
}
}
}