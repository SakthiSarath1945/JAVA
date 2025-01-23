import java.util.Scanner;
class Primeno{
public static void main(String[] args){
System.out.print("Enter the number:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
for(int i=2;i<=num;i++){
if(num%i==0){
count++;
}
}
if(count==1){
System.out.print("It is a Prime Number");
}
else{
System.out.print("It is not a Prime Number");
}
}
}
