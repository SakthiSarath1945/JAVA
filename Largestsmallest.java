import java.util.*;

public class Largestsmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
        System.out.println("Enter the fourth number:");
        int d=sc.nextInt();
        
    int largest=a;
    if(b>largest){
        largest=b;
    }
    if(c>largest){
        largest=c;
    }
    if(d>largest){
        largest=d;
    }
    System.out.println(largest);

    int smallest=a;
    if(b<smallest){
        smallest=b;
    }
    if(c<smallest){
        smallest=c;
    }
    if(d<smallest){
        smallest=d;
    }
        System.out.println(smallest);
        
        
    

    }
}