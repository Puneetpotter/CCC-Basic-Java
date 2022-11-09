import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		double tot = a+b+c+d;
		double ap= (a/tot)*100;
		double bp= (b/tot)*100;
		double cp= (c/tot)*100;
		double dp= (d/tot)*100;
		System.out.printf("Total expenses : Rs.%.2f\n",tot);
		System.out.printf("Branding expenses percentage : %.2f%%\n",ap);
    System.out.printf("Travel expenses percentage : %.2f%%\n",bp);
    System.out.printf("Food expenses percentage : %.2f%%\n",cp);
    System.out.printf("Logistics expenses percentage : %.2f%%\n",dp);
	}
}
