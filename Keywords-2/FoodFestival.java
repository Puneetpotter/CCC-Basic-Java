import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int res = a*a - b*b;
		System.out.printf("%d",res);
	}
}
