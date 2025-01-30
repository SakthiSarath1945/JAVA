import java.util.Scanner;
class Sumeven {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the first number:");
    int a=sc.nextInt();
    System.out.println("Enter the second number:");
    int b=sc.nextInt();
     int sum =a+b;
     System.out.println("Sumof two number is:"+sum);
    if(sum%2==0){
        System.out.println("Sum is even");
    }
    else{
        System.out.println("Sum is odd");
    }
    }
    }

