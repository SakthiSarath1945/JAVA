import java.util.Scanner;
class Negative{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0 || a>0){
			if(a%2==0){
				System.out.println("Even Number");
			}
			else{
				System.out.println("Odd Number");
			}
		}
	}
}