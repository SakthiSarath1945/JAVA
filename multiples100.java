import java.util.*;
public class multiples100 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
System.out.println("Enter a number:");  
int a = sc.nextInt();   
if(a%100==0){
System.out.println("The number is a multiple of 100");
}
else{   
System.out.println("The number is not a multiple of 100");  
}
}
    
}
