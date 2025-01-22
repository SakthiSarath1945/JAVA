import java.util.Scanner;
class Reverseno{
public static void main(String[] args){
System.out.print("Enter the no:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int result=0;
while(a>0){
int rem=a%10;
result=result*10+rem;
a=a/10;
}
System.out.print(result);
}
}	
