import java.util.Scanner;
class Greatestternery{
public static void main(String[] args){
System.out.println("Enter A:");
System.out.println("Enter B:");
System.out.println("Enter C:");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
int q=(a>b)?((a>c)?a :c) :((b>c)?b:c);
System.out.println("Greatest number is:"+q);
}
}



