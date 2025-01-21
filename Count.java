import java.util.Scanner;
class Count{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=0;
while(a>0){
a=a/10;
b++;
}
System.out.println(b);
}
}