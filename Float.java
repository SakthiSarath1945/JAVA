import java .util.Scanner;
class Float{
public static void main(String[] args){
System.out.println("enter the float no:");
Scanner sc=new Scanner(System.in);
float a=sc.nextFloat();
float b=sc.nextFloat();
int x=Math.round(a*100);
int y=Math.round(b*100);
System.out.print(x);
System.out.print(y);
if(x==y){
System.out.print("Float values are equal");
}
else{
System.out.print("Float values are not equal");
}
}
}
